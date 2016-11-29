/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.demoiselle.jee7.example.store.product.service;

import io.swagger.annotations.Api;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import org.demoiselle.jee.core.api.security.SecurityContext;
import org.demoiselle.jee.persistence.crud.AbstractREST;
import org.demoiselle.jee.security.annotation.LoggedIn;
import org.demoiselle.jee7.example.store.product.entity.Product;

/**
 *
 * @author 70744416353
 * @param <I>
 */
@Api("Produto")
@Path("product")
public class ProductREST extends AbstractREST<Product, Long > {

    @Inject
    private SecurityContext securityContext;

  
    @GET
    @Path("testecom")
    @LoggedIn
    public Response testeCom() {
        return Response.ok().entity(securityContext.getUser().toString()).build();
    }
}
