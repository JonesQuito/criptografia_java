package com.criptografia.service;

public class CifrasDeCesar {

    public static String encriptaCesar(String texto, int chave) {

        byte[] caracteres = texto.getBytes();
        int index = 0;

          
        for (byte b : caracteres) {
            if ((b >= 65 && b <= 90)) {

                for (int i = 0; i < chave; i++) {
                    b += 1;
                    if (b > 90) {
                        b = 65;
                    }
                }

            } else if ((b >= 97 && b <= 122)) {
                for (int i = 0; i < chave; i++) {
                    b = (byte) (b + 1);
                    if (b > 122) {
                        b = 97;
                    }
                }

            }
            caracteres[index] = b;
            index++;

            //System.out.printf("%c", b);
        }

            return new String(caracteres);
        }

    

    public static String decriptografarCesar(String texto, int chave) {
        byte[] caracteres = texto.getBytes();
        int index = 0;

        for (byte b : caracteres) {
            if ((b >= 65 && b <= 90)) {

                for (int i = 0; i < chave; i++) {
                    b -= 1;
                    if (b < 65) {
                        b = 90;
                    }
                }

            } else if ((b >= 97 && b <= 122)) {
                for (int i = 0; i < chave; i++) {
                    b -= 1;
                    if (b < 97) {
                        b = 122;
                    }
                }

            }
            caracteres[index] = b;
            index++;

            //System.out.printf("%c", b);
        }

        return new String(caracteres);
    }

}
