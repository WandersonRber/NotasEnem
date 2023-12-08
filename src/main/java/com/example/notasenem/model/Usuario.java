package com.example.notasenem.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String login;
    private String senha;
    private String nome;
    private int idade;
    private String cpf;
    private float notaLiguagem;
    private float notaCienciasHumanas;
    private float notaCienciasDaNatureza;
    private float notaMatematica;
    private float redacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getNotaLiguagem() {
        return notaLiguagem;
    }

    public void setNotaLiguagem(float notaLiguagem) {
        this.notaLiguagem = notaLiguagem;
    }

    public float getNotaCienciasHumanas() {
        return notaCienciasHumanas;
    }

    public void setNotaCienciasHumanas(float notaCienciasHumanas) {
        this.notaCienciasHumanas = notaCienciasHumanas;
    }

    public float getNotaCienciasDaNatureza() {
        return notaCienciasDaNatureza;
    }

    public void setNotaCienciasDaNatureza(float notaCienciasDaNatureza) {
        this.notaCienciasDaNatureza = notaCienciasDaNatureza;
    }

    public float getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(float notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getRedacao() {
        return redacao;
    }

    public void setRedacao(float redacao) {
        this.redacao = redacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
