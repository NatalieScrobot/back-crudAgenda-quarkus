package org.acme.api;

import org.acme.domain.entity.Contato;
import org.acme.domain.entity.service.ContatoService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/agenda")
@RequestScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ResourceContato {
    @Inject
    ContatoService service;

    @GET
    @Transactional
    public List<Contato> testaMetodo(){
      return service.listar();
    }

    @POST
    @Transactional
    public void gravarContato(Contato contato){
        service.gravar(contato);
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void deletarContato(@PathParam("id") Long id){
        service.deletar(id);
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public void atualizarContato(@PathParam("id") Long id, Contato contato){
        service.alterar(contato, id);
    }
}
