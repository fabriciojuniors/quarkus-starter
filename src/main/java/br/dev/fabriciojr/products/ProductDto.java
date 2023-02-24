package br.dev.fabriciojr.products;

import br.dev.fabriciojr.builder.AbstractDtoBuilder;

public class ProductDto {
    private String name;
    private String category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static final class Builder extends AbstractDtoBuilder<ProductDto, Product> {

        private Builder(ProductDto entity) {
            super(entity);
        }

        public static Builder create() {
            return new Builder(new ProductDto());
        }

        public static Builder from(ProductDto dto) {
            return new Builder(dto);
        }

        @Override
        public ProductDto toRepresentation(Product entity) {
            return create()
                    .name(entity.getName())
                    .category(entity.getCategory())
                    .build();
        }

        @Override
        public Product fromRepresentation(ProductDto dto) {
            return Product.Builder.create()
                    .name(dto.name)
                    .category(dto.category)
                    .build();
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
