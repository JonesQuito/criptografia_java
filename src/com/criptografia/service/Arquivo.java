package com.criptografia.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Arquivo {

    public static File abrirArquivo() {
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if(fc.showOpenDialog(null)== 1){
            return null;
        }
            
        File file = fc.getSelectedFile();
        return file;
    }

    public static String lerArquivoTxt(File arquivo) throws FileNotFoundException, IOException {
        FileReader reader = new FileReader(arquivo);
        BufferedReader buffer = new BufferedReader(reader);

        String linha;
        String texto = new String();

        // Lê linha a linha e adiciona em uma variável chamada 'texto'
        while (buffer.ready()) {
            linha = buffer.readLine();
            texto += linha + "\n";
        }
        
        return texto;
    }

    public static void gravarTxt2(Path caminho, String texto) throws IOException {
        byte[] textoEmBytes = texto.getBytes();

        Files.write(caminho, textoEmBytes);
    }

    public static void gravarTxt(String texto, String destino) throws IOException {
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
