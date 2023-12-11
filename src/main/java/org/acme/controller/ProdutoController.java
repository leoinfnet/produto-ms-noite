package org.acme.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.acme.model.Produto;
import org.acme.service.ProdutoService;

import java.util.List;

@Path("/")
public class ProdutoController {

    @Inject
    ProdutoService produtoService;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Produto> getAll(){
        return produtoService.getAll();

    }
}
