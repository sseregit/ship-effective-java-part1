package jang.effective.java.chapter05.item26.genericdao;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class GenericRepository<E extends Entity> {

    private final Set<E> entities;

    public GenericRepository() {
        entities = new HashSet<>();
    }

    public Optional<E> findById(Long id) {
        return entities.stream().filter(a -> a.getId().equals(id)).findAny();
    }

    public void add(E entity) {
        this.entities.add(entity);
    }
}
