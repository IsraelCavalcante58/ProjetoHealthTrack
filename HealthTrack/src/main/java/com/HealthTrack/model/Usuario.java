package com.HealthTrack.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;


@Getter
@Setter
@Entity
@Table(name = "T_USUARIO")
public class Usuario {

    @Id
    @Column (name = "cd_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nm_usuario")
    private String nome;

    @Column(name = "email_usuario")
    private String email;

    @Column(name = "pass_usuario")
    private String senha;

    @Column(name = "vl_peso")
    private float peso;

    @Column(name = "vl_datanasc")
    private LocalDate dataNasc;

    @Column(name = "nr_celular")
    private String numeroCelular;

    @Column(name = "vl_altura")
    private float altura;

    @Column(name = "ds_pais")
    private String pais;

    @Column(name = "ds_estado")
    private String estado;

    @Column(name = "ds_cidade")
    private String cidade;

    public int getIdade() {
        LocalDate dataAtual = LocalDate.now();
        return dataNasc.until(dataAtual).getYears();
    }


}
