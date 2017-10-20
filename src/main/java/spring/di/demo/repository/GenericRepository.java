package spring.di.demo.repository;

import java.util.Collection;

public interface GenericRepository<ENT, ID> {

    Collection<ENT> findAll();

    void update(ENT ent);

    void remove(ID id);

    ENT find(ID id);

    void save(ENT ent);
}
