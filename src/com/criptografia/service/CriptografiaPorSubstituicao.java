
package com.criptografia.service;

public class CriptografiaPorSubstituicao {
    
    public static String criptografar(String texto, int chave){

        char[] letras = texto.toUpperCase().toCharArray();
        int index = 0;
        int deslocamento = 0;
        
        for(char b : letras){
            if(b>=65 && b<=90){
                deslocamento = chave +(index * chave)%26;
                for(int i=0; i<deslocamento; i++){
                    b++;
                    if(b>90){
                        b = 65;
                    }
                }
            }
            letras[index] = b;
            index++;
        }
        return new String(letras);
    }
    
    
    public static String decriptografar(String texto, int chave){

        char[] letras = texto.toUpperCase().toCharArray();
        int index = 0;
        int deslocamento = 0;
        
        for(char b : letras){
            if(b>=65 && b<=90){
                deslocamento = chave +(index * chave)%26;
                for(int i=0; i<deslocamento; i++){
                    b--;
                    if(b<65){
                        b = 90;
                    }
                }
            }
            letras[index] = b;
            index++;
        }
        return new String(letras);
    }
    
}
