package spring.di.demo.timer;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.time.ZonedDateTime;

@Scope("prototype")
@Component
public class Timer {

    private ZonedDateTime time;

    @PostConstruct
    public void init() {
        time = ZonedDateTime.now();
        System.out.println("Timer#init --- time is: " + time);
    }


    @PreDestroy
    public void destroy() {
        System.out.println("Timer#destroy");
    }

}
