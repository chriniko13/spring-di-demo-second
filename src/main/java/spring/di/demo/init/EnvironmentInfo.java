package spring.di.demo.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
public class EnvironmentInfo {

    @Autowired
    private Environment environment;

    @PostConstruct
    public void init() {

        String[] defaultProfiles = environment.getDefaultProfiles();

        System.out.println("EnvironmentInfo#init --- defaultProfiles == " + Arrays.toString(defaultProfiles));

    }

}
