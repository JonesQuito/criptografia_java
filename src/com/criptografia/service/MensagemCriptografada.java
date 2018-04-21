package com.criptografia.service;

import java.io.Serializable;
import javax.crypto.spec.SecretKeySpec;

public class MensagemCriptografada implements Serializable{
    private static final Long serialversionUID = 1L;

    private byte[] mensagem;
    private SecretKeySpec skeySpec;
    //private Cipher cipher;

    public byte[] getMensagem() {
        return mensagem;
    }

    public void setMensagem(byte[] mensagem) {
        this.mensagem = mensagem;
    }

    public SecretKeySpec getSkeySpec() {
        return skeySpec;
    }

    public void setSkeySpec(SecretKeySpec skeySpec) {
        this.skeySpec = skeySpec;
    }
}
