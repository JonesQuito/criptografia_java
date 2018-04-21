/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import com.criptografia.service.CriptografiaAES;
import static com.criptografia.service.CriptografiaAES.asHex;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author Jones
 */
public class Teste2 {
    
    public static void main(String[] args) throws Exception{
        String message = "This is just an example de criptografia com chave simétrica";
        SecretKeySpec skeySpec = CriptografiaAES.getKeyAES();
        Cipher cipher = Cipher.getInstance("AES");
        byte[] encrypted;
        
        encrypted = CriptografiaAES.criptografar(skeySpec, message, cipher);
        System.out.println("Mensagem criptografada: " + asHex(encrypted));

        String originalString =CriptografiaAES.decriptografar(skeySpec, encrypted, cipher);
        System.out.println("Original string: " + originalString);
    }
    
}
