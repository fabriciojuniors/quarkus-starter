package br.dev.fabriciojr.products;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import java.util.Collection;

@ApplicationScoped
public class ProductResource {

    @GET
    public Collection<Product> findAll(){
        return Product.listAll();
    }

    @POST
    @Transactional
    public Product save(Product product){
        product.persist();
        return product;
    }

}
