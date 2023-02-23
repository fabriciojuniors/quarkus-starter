package br.dev.fabriciojr.products;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

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
}
