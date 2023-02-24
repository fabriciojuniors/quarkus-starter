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
    public Collection<ProductDto> findAll(){
        return ProductDto.Builder.create().toRepresentation(repository.listAll());
    }

    @POST
    @Transactional
    public ProductDto save(ProductDto dto){
        final Product product = ProductDto.Builder.create().fromRepresentation(dto);
        repository.persist(product);
        return ProductDto.Builder.create().toRepresentation(product);
    }

}
