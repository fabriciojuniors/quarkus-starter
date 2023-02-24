package br.dev.fabriciojr.products;

import br.dev.fabriciojr.builder.AbstractBuilder;

import javax.persistence.*;

import static br.dev.fabriciojr.database.DatabaseConstants.APPLICATION_SCHEMA;

@Entity
@Table(schema = APPLICATION_SCHEMA, name = "PRODUCTS")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    private String name;
    private String category;

    public Product() {
    }

    public Product(Long id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Long getId() {
        return id;
    }

    public static class Builder extends AbstractBuilder<Product> {

        private Builder(Product entity) {
            super(entity);
        }

        public static Builder create() {
            return new Builder(new Product());
        }

        public static Builder from(Product product) {
            return new Builder(product);
        }

        public Builder name(final String name) {
            entity.name = name;
            return this;
        }

        public Builder category(final String category) {
            entity.category = category;
            return this;
        }
    }
}
