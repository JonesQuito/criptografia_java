package com.criptografia.util;

import java.io.File;

import javax.swing.JFileChooser;

public class Util {

    public static File abrirArquivo() {
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fc.showOpenDialog(null);
        File file = fc.getSelectedFile();
        return file;
    }

}
