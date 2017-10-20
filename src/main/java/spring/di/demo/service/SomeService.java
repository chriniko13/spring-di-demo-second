package spring.di.demo.service;

import spring.di.demo.repository.SomeRepository;

public class SomeService {

    private SomeRepository someRepository;

    public SomeService() {
    }

    public SomeService(SomeRepository someRepository) {
        this.someRepository = someRepository;
    }

    public void setSomeRepository(SomeRepository someRepository) {
        this.someRepository = someRepository;
    }

    public void foo() {
        System.out.println("SomeService#foo");
        someRepository.bar();
    }
}
