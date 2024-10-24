package fr.dawan.unbot.generic;

import java.util.List;

public interface FakeJpaRepository<E> {
    List<E> findAll();
    E getById(long id);
    E save(E entity);
    void deleteById(long id);
}
