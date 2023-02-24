package br.dev.fabriciojr.builder;

import java.util.Collection;

public abstract class AbstractDtoBuilder<T, V>  extends AbstractBuilder<T> implements IDtoBuilder<T, V> {

    public AbstractDtoBuilder(T entity) {
        super(entity);
    }

    public AbstractDtoBuilder() {
        super();
    }

    @Override
    public Collection<T> toRepresentation(Collection<V> entities) {
        return entities.stream()
                .map(this::toRepresentation)
                .toList();
    }
}
