package spring.di.demo.demonstration;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import spring.di.demo.domain.Balloon;
import spring.di.demo.domain.Motorcycle;
import spring.di.demo.service.*;
import spring.di.demo.timer.Timer;
import spring.di.demo.validator.SomeValidator;

public class BasicDemonstrator implements ApplicationContextAware {

    private final MotorcycleService motorcycleService;
    private final SomeService someService;
    private final MessageService messageService;

    private ApplicationContext applicationContext;

    @Autowired
    private ObjectFactory<Timer> timerObjectFactory;

    @Autowired
    //@Qualifier("heavy") //Note: comment-uncomment to see what happens...
    private HeavyCalculation heavyCalculation;

    @Autowired
    private SampleService sampleService;

    @Autowired
    public BasicDemonstrator(MotorcycleService motorcycleService, SomeService someService, MessageService messageService) {
        this.motorcycleService = motorcycleService;
        this.someService = someService;
        this.messageService = messageService;
    }

    public void runFirstExample() {

        System.out.println("\n------running first example------");

        System.out.println("\n~~~findAll demonstration~~~");
        motorcycleService.findAll().forEach(System.out::println);


        System.out.println("\n~~~find demonstration~~~");
        Motorcycle motorcycle = motorcycleService.find(1L);
        System.out.println(motorcycle);


        System.out.println("\n~~~update demonstration~~~");
        motorcycle.setYear("2014");
        motorcycleService.update(motorcycle);
        System.out.println(motorcycle);


        System.out.println("\n~~~remove demonstration~~~");
        motorcycleService.remove(1L);
        motorcycle = motorcycleService.find(1L);
        System.out.println(motorcycle);


        System.out.println("\n~~~save demonstration~~~");
        motorcycleService.save(Motorcycle.builder().id(123L).manufacturer("Aprilia").model("Dorsoduro-1200").year("2011").build());
        motorcycle = motorcycleService.find(123L);
        System.out.println(motorcycle);
    }

    public void runSecondExample() {
        System.out.println("\n------running second example------");
        someService.foo();
    }


    public void runThirdExample() {
        System.out.println("\n------running third example------");
        heavyCalculation.calculate();
    }

    public void runFourthExample() {
        System.out.println("\n------running fourth example------");
        messageService.foo();
    }

    public void runFifthExample() {

        System.out.println("\n------running fifth example------");
        timerObjectFactory.getObject();

    }

    public void runSixthExample() {

        System.out.println("\n------running sixth example------");

        applicationContext.getBean(SomeValidator.class).validate("some-data-here");

        ((SomeValidator) applicationContext.getBean("chrinikoValidator")).validate("yolo-data-here");
    }

    public void runSeventhExample() {

        System.out.println("\n------running seventh example------");

        Balloon balloon1 = applicationContext.getBean("balloon1", Balloon.class);
        System.out.println("balloon1 == " + balloon1);

        Balloon balloon2 = applicationContext.getBean("balloon2", Balloon.class);
        System.out.println("balloon2 == " + balloon2);

        Balloon balloon3 = applicationContext.getBean("balloon3", Balloon.class);
        System.out.println("balloon3 == " + balloon3);

        Balloon balloon4 = applicationContext.getBean("balloon4", Balloon.class);
        System.out.println("balloon4 == " + balloon4);
    }


    public void runEighthExample() {

        System.out.println("\n------running eighth example------");

        sampleService.foo();

        ((ChrinikoService)applicationContext.getBean("chrinikoService")).boom();

        ((SpringRocks)applicationContext.getBean("springRocks")).foo();

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }


}
