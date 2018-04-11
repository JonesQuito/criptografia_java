/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.criptografia.service;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author Jones
 */
public class CriptografiaAes {
    
    private static KeyGenerator kgen;
    private static SecretKey skey;
    private static SecretKeySpec skeySpec;
    private static byte[] raw;
    private static Cipher cipher;
    
    public CriptografiaAes() throws Exception{
        kgen = KeyGenerator.getInstance("AES");
        skey = kgen.generateKey();
        raw = skey.getEncoded();
        skeySpec = new SecretKeySpec(raw, "AES");
        cipher = Cipher.getInstance("AES");
        
    }


    public String asHex(byte buf[]) {
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

    public byte[] criptografarTexto(byte[] texto)
            throws NoSuchAlgorithmException, NoSuchPaddingException,
            InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        String textoCriptografado;
        //Cipher cipher = getCipherInstance();
        //SecretKeySpec skeySpec = getKeyAes();
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] encrypted = cipher.doFinal(texto);

        return encrypted;
    }

    public byte[] descriptografarTexto(byte[] texto) throws Exception {
        String textoDescriptografado;
        //Cipher cipher = getCipherInstance();
        //SecretKeySpec skeySpec = getKeyAes();
        cipher.init(Cipher.DECRYPT_MODE, skeySpec);
        byte[] decripted = cipher.doFinal(texto);

        return decripted;
    }

}
