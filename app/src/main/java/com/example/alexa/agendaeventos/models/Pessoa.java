package com.example.alexa.agendaeventos.models;

/**
 * Created by alexa on 30/05/2017.
 */

public class Pessoa {

    private String curso;
    private String email;
    private String nome;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getTipoDePessoa() {
        return tipoDePessoa;
    }

    public void setTipoDePessoa(String tipoDePessoa) {
        this.tipoDePessoa = tipoDePessoa;
    }

    private String periodo;
    private String tipoDePessoa;
}
