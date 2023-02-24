package br.dev.fabriciojr.builder;

public abstract class AbstractBuilder<T> implements IBuilder<T>{

    protected T entity;

    public AbstractBuilder(T entity) {
        this.entity = entity;
    }

    public AbstractBuilder() {
    }

    @Override
    public T build() {
        return entity;
    }
}
