package br.dev.fabriciojr.products;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import java.util.Collection;

@ApplicationScoped
public class ProductResource {

    @Inject
    private ProductRepository repository;

    @GET
    public Collection<Product> findAll(){
        return repository.listAll();
    }

    @POST
    @Transactional
    public Product save(Product product){
        repository.persist(product);
        return product;
    }

}
