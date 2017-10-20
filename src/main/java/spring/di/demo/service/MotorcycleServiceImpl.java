package spring.di.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.di.demo.domain.Motorcycle;
import spring.di.demo.repository.MotorcycleRepository;

import java.util.Collection;

@Service
public class MotorcycleServiceImpl implements MotorcycleService {

    private MotorcycleRepository motorcycleRepository;

    @Autowired
    public void setMotorcycleRepository(MotorcycleRepository motorcycleRepository) {
        this.motorcycleRepository = motorcycleRepository;
    }

    @Override
    public Collection<Motorcycle> findAll() {
        return motorcycleRepository.findAll();
    }

    @Override
    public void update(Motorcycle motorcycle) {
        motorcycleRepository.update(motorcycle);
    }

    @Override
    public void remove(Long id) {
        motorcycleRepository.remove(id);
    }

    @Override
    public Motorcycle find(Long id) {
        return motorcycleRepository.find(id);
    }

    @Override
    public void save(Motorcycle motorcycle) {
        motorcycleRepository.save(motorcycle);
    }
}
