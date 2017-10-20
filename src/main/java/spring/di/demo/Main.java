package spring.di.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import spring.di.demo.demonstration.BasicDemonstrator;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = getApplicationContext();

        BasicDemonstrator basicDemonstrator = context.getBean(BasicDemonstrator.class);
        basicDemonstrator.runFirstExample();
        basicDemonstrator.runSecondExample();
        basicDemonstrator.runThirdExample();
        basicDemonstrator.runFourthExample();
        basicDemonstrator.runFifthExample();
        basicDemonstrator.runSixthExample();
        basicDemonstrator.runSeventhExample();
        basicDemonstrator.runEighthExample();
    }

    private static ApplicationContext getApplicationContext() {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ConfigurableEnvironment env = ctx.getEnvironment();
        env.setDefaultProfiles("dev");
        ctx.load("config-beans.xml");
        ctx.refresh();


        System.out.println("\n\n~~~~PRINTING REGISTERED BEANS ~~~~");
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).filter(bean -> !bean.contains("springframework")).forEach(System.out::println);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        return ctx;
    }
}
