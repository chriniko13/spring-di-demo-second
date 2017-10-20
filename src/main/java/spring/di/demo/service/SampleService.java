package spring.di.demo.service;

import spring.di.demo.annotation.Kickstart;

@Kickstart
public class SampleService {

    public void foo() {
        System.out.println("SampleService#foo");
    }
}
