package org.acme.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.awt.*;
import java.util.Map;

@Path("/")
public class ProdutoController {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String,String> getHello(){
        return Map.of("Message", "Hello");
    }
}
