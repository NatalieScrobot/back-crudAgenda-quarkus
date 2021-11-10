package org.acme.domain.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private String grauParentesco;
    @ElementCollection
    @CollectionTable(name="Telefones",joinColumns = @JoinColumn(name="id"))
    @Fetch(FetchMode.JOIN)
    private List<Telefones> telefone;

    public Contato() {
    }

    public Contato(String nome, String sobrenome, LocalDate dataNascimento, String grauParentesco, List<Telefones> telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.grauParentesco = grauParentesco;
        this.telefone = telefone;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGrauParentesco() {
        return grauParentesco;
    }

    public void setGrauParentesco(String grauParentesco) {
        this.grauParentesco = grauParentesco;
    }

    public List<Telefones> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<Telefones> telefone) {
        this.telefone = telefone;
    }
}
