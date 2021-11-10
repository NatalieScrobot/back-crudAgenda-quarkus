package org.acme.domain.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Telefones {
    private Long telefone;

    public Telefones() {
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }
}
