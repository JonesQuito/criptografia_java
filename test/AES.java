

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.*;
import javax.crypto.spec.*;

public class AES {

    public static String asHex(byte buf[]) {
        StringBuffer strbuf = new StringBuffer(buf.length * 2);
        int i;
        for (i = 0; i < buf.length; i++) {
            if (((int) buf[i] & 0xff) < 0x10) {
                strbuf.append("0");
            }

            strbuf.append(Long.toString((int) buf[i] & 0xff, 16));
        }
        return strbuf.toString();
    }

    public static SecretKeySpec getKeyAES() throws Exception {
        // Get the KeyGenerator
        KeyGenerator kgen = KeyGenerator.getInstance("AES");
        //kgen.init(256); 

        // Generate the secret key specs.
        SecretKey skey = kgen.generateKey();
        byte[] raw = skey.getEncoded();
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        return skeySpec;
    }

    public static byte[] criptografar(SecretKeySpec skeySpec, String message, Cipher cipher) 
            throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, 
            IllegalBlockSizeException, BadPaddingException {
        //Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] encrypted = cipher.doFinal(message.getBytes());
        return encrypted;
    }
    
    public static String decriptografar(SecretKeySpec skeySpec, byte[] encrypted, Cipher cipher)
            throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, 
            IllegalBlockSizeException, BadPaddingException{
        //Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, skeySpec);
        byte[] original = cipher.doFinal(encrypted);
        return new String(original);
    }

    public static void main(String[] args) throws Exception {
        String message = "This is just an example de criptografia com chave simétrica";
        SecretKeySpec skeySpec = getKeyAES();
        Cipher cipher = Cipher.getInstance("AES");
        byte[] encrypted;
        
        encrypted = criptografar(skeySpec, message, cipher);
        System.out.println("Mensagem criptografada: " + asHex(encrypted));

        String originalString = decriptografar(skeySpec, encrypted, cipher);
        System.out.println("Original string: " + originalString + " " + asHex(originalString.getBytes()));
    }

}
