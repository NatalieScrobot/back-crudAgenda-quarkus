package org.acme.domain.entity.service;

import java.util.List;

public interface Service <Generic>{
    void gravar(Generic object);
    void deletar(Long id);
    void alterar(Generic object, Long id);
    Generic buscarPorId(Generic object);
    List<Generic> listar();
}
