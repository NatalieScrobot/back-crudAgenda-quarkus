package org.acme.domain.entity.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.acme.domain.entity.Contato;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class ContatoRepository implements PanacheRepository<Contato> {
}
