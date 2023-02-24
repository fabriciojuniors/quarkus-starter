package br.dev.fabriciojr.builder;

import java.util.Collection;

public interface IDtoBuilder<T, V> extends IBuilder<T>{

    T toRepresentation(V entity);
    V fromRepresentation(T dto);
    Collection<T> toRepresentation(Collection<V> entities);

}
