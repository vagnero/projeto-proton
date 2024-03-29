package com.proton.models.entities;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "municipe")
public class Municipe implements Serializable {

    private static final long serialVersionUID = 1L;

    public Municipe(Integer id_municipe, String nome_municipe, String email, String senha, String num_CPF, LocalDate data_nascimento,
            Endereco id_enderecoFK) {
        this.id_municipe = id_municipe;
        this.nome_municipe = nome_municipe;
        this.email = email;
        this.senha = senha;
        this.num_CPF = num_CPF;
        this.data_nascimento = data_nascimento;
        this.endereco = id_enderecoFK;
    }

    public Municipe(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_municipe")
    private Integer id_municipe;

    @Column(name = "nome_municipe", nullable = false)
    private String nome_municipe;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "senha", nullable = false)
    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Column(name = "num_CPF", nullable = false, unique = true)
    private String num_CPF;

    @JsonFormat(pattern="dd-MM-yyyy")
    @Column(name = "data_nascimento", nullable = true)
    private LocalDate data_nascimento;

    

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_enderecoFK", referencedColumnName = "id_endereco")
    private Endereco endereco;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Integer getId_municipe() {
        return id_municipe;
    }

    public void setId_municipe(Integer id_municipe) {
        this.id_municipe = id_municipe;
    }

    public String getNome_municipe() {
        return nome_municipe;
    }

    public void setNome_municipe(String nome_municipe) {
        this.nome_municipe = nome_municipe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNum_CPF() {
        return num_CPF;
    }

    public void setNum_CPF(String num_CPF) {
        this.num_CPF = num_CPF;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id_municipe == null) ? 0 : id_municipe.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Municipe other = (Municipe) obj;
        if (id_municipe == null) {
            if (other.id_municipe != null)
                return false;
        } else if (!id_municipe.equals(other.id_municipe))
            return false;
        return true;
    }

    
}


