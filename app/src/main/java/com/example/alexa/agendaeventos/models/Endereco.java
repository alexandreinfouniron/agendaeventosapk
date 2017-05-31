package com.example.alexa.agendaeventos.models;

/**
 * Created by alexa on 30/05/2017.
 */

public class Endereco {

    public String getBairro() {return bairro;}

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    private String bairro;
    private String numero;
    private String rua;
}
