package spring.di.demo.init;

public class InitA {

    public void init() {
        System.out.println("InitA#init method called!");
    }

    public void destroy() {
        System.out.println("InitA#destroy destroy called!");
    }
}
