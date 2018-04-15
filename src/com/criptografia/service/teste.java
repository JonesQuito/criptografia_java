/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.criptografia.service;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 *
 * @author Jones
 */
public class teste {
    
    public static void main(String[] args) 
            /*throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, 
            IllegalBlockSizeException, BadPaddingException, Exception*/{
        try {
            /*CriptografiaAes criptografiaAes = new CriptografiaAes();
            System.out.println("Texto Original: Jones Quito");
            byte[] cripted = criptografiaAes.criptografarTexto("Jones Quito de Oliveira".getBytes());
            String criptografado = new String(criptografiaAes.asHex(cripted));
            System.out.println("Texto Criptografado: " + criptografado);
            System.out.println("Texto Deriptografado: " + new String(criptografiaAes.descriptografarTexto(cripted)));
            // CriptografiaAes.teste("Jones Quito");
            */
            Arquivo.writeArrayOfBytes("Jones Quito".getBytes(), Arquivo.abrirArquivo());
        } catch (IOException ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
