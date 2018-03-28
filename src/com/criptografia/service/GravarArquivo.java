
package com.criptografia.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.swing.JOptionPane;

public class GravarArquivo {
    
    public static void gravarTxt2(Path caminho, String texto) throws IOException {
        byte[] textoEmBytes = texto.getBytes();
        
        Files.write(caminho, textoEmBytes);
    }
    
    
    public static void gravarTxt(String texto, String destino) throws IOException{
        // Cria arquivo
        File file = new File(destino);

        // Se o arquivo nao existir, ele gera
        if (!file.exists()) {
            file.createNewFile();
        }

        // Prepara para escrever no arquivo
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);

        // Escreve e fecha arquivo
        bw.write(texto);
        bw.close();
    }
    
}
