package fr.dawan.unbot.generic;

public interface GenericMapper<D,E> {
    D toDto(E entity);
    E toEntity(D dto);
}
