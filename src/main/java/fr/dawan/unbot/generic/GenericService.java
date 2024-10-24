package fr.dawan.unbot.generic;

import java.util.List;

public interface GenericService<D> {
    List<D> findAll();
    D getById(long id);
    D saveOrUpdate(D entity);
    void deleteById(long id);
}
