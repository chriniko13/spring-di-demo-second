package spring.di.demo.service;

import spring.di.demo.domain.Motorcycle;

import java.util.Collection;

public interface MotorcycleService {

    Collection<Motorcycle> findAll();

    void update(Motorcycle motorcycle);

    void remove(Long id);

    Motorcycle find(Long id);

    void save(Motorcycle motorcycle);
}
