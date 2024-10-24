package fr.dawan.unbot.generic;

import fr.dawan.unbot.user.UserRepository;

import java.util.List;

public class GenericServiceImpl<
        D,
        E,
        R extends FakeJpaRepository<E>,
        M extends GenericMapper<D,E>
        > implements GenericService<D> {
    protected R repository;
    protected M mapper;

    @Override
    public List<D> findAll() {
        return repository.findAll()
                .stream()
                .map(user -> mapper.toDto(user))
                .toList();
    }

    @Override
    public D getById(long id) {
        return mapper.toDto(repository.getById(id));
    }

    @Override
    public D saveOrUpdate(D entity) {
        return mapper.toDto(repository.save(mapper.toEntity(entity)));
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
