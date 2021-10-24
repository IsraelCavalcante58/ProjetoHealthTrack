package com.HealthTrack.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
public class Usuario {
    private String nome;
    private String senha;
    private float peso;
    private LocalDate dataNasc;
    private String numeroCelular;
    private float altura;
    private String pais;
    private String estado;
    private String cidade;

    public int getIdade() {
        LocalDate dataAtual = LocalDate.now();
        return dataNasc.until(dataAtual).getYears();
    }

    public void dadosUsuario() {
        System.out.println("Nome: " + getNome() +
                "\nIdade: " + getIdade() +
                "\n Peso: " + getPeso() +
                "\n Altura: " + getAltura() +
                "\n País: " + getPais() +
                "\n Tel: " + getNumeroCelular());
    }
}
