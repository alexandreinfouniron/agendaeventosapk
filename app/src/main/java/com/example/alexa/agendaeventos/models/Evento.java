package com.example.alexa.agendaeventos.models;

import java.sql.Time;
import java.util.Date;

/**
 * Created by alexa on 30/05/2017.
 */

public class Evento {
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getDuracao() {
        return duracao;
    }

    public void setDuracao(Time duracao) {
        this.duracao = duracao;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    private Date data;
    private Time duracao;
    private String nomeEvento;
}
