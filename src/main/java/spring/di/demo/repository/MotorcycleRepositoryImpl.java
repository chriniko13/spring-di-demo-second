package spring.di.demo.repository;

import org.springframework.stereotype.Repository;
import spring.di.demo.domain.Motorcycle;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class MotorcycleRepositoryImpl implements MotorcycleRepository {

    private Map<Long, Motorcycle> db;

    public void setDb(Map<Long, Motorcycle> db) {
        this.db = db;
    }

    public Collection<Motorcycle> findAll() {
        return db.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }

    public void update(Motorcycle motorcycle) {
        db.put(motorcycle.getId(), motorcycle);
    }

    public void remove(Long id) {
        db.remove(id);
    }

    public Motorcycle find(Long id) {
        return db.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .filter(motorcycle -> motorcycle.getId().equals(id))
                .findAny()
                .orElse(null);
    }

    public void save(Motorcycle motorcycle) {
        db.put(motorcycle.getId(), motorcycle);
    }
}
