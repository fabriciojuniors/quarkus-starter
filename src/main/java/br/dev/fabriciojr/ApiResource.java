package br.dev.fabriciojr;

import br.dev.fabriciojr.products.ProductResource;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/api")
public class ApiResource {

    @Inject
    private ProductResource productResource;

    @Path("/products")
    public ProductResource productResource() {
        return productResource;
    }

}
