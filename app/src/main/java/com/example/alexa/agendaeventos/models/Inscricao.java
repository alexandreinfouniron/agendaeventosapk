package com.example.alexa.agendaeventos.models;

import java.util.Date;

/**
 * Created by alexa on 30/05/2017.
 */

public class Inscricao {
    private Date dataConfirmacao;
    private Date dataInscricao;

    public Date getDataConfirmacao() {
        return dataConfirmacao;
    }

    public void setDataConfirmacao(Date dataConfirmacao) {
        this.dataConfirmacao = dataConfirmacao;
    }

    public Date getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(Date dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    public boolean isPresenca() {
        return presenca;
    }

    public void setPresenca(boolean presenca) {
        this.presenca = presenca;
    }

    private boolean presenca;
}
