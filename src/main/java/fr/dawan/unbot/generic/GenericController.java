package fr.dawan.unbot.generic;

import java.util.List;

public class GenericController<D, S extends GenericService<D>> {
    protected S service;

    public List<D> findAll() {
        return service.findAll();
    }

    D getById(long id) {
        return service.getById(id);
    }
    D saveOrUpdate(D entity) {
        return service.saveOrUpdate(entity);
    }
    void deleteById(long id) {
        service.deleteById(id);
    }
}
