package org.acme.domain.entity.service;

import org.acme.domain.entity.Contato;
import org.acme.domain.entity.repository.ContatoRepository;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@RequestScoped
public class ContatoService implements Service<Contato>{
    @Inject
    ContatoRepository repositorio;
    @Override
    public void gravar(Contato object) {
        repositorio.persist(object);
    }

    @Override
    public void deletar(Long id) {
        repositorio.deleteById(id);
    }

    @Override
    public void alterar(Contato object, Long id) {
        Contato contato = repositorio.findById(id);
        contato.setNome(object.getNome());
        contato.setDataNascimento(object.getDataNascimento());
        contato.setGrauParentesco(object.getGrauParentesco());
        contato.setTelefone(object.getTelefone());
        repositorio.persist(contato);
    }

    @Override
    public Contato buscarPorId(Contato object) {
        return repositorio.findById(object.getId());
    }

    @Override
    public List<Contato> listar() {
       return repositorio.listAll();
    }
}
