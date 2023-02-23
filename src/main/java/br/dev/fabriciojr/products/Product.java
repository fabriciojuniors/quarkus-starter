package br.dev.fabriciojr.products;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

import static br.dev.fabriciojr.database.DatabaseConstants.APPLICATION_SCHEMA;

@Entity
@Table(schema = APPLICATION_SCHEMA, name = "PRODUCTS")
public class Product extends PanacheEntity {
    private String name;
    private String category;

    public Product() {
    }

    public Product(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
}
