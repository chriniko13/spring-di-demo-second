package spring.di.demo.factory;

import org.springframework.beans.factory.FactoryBean;
import spring.di.demo.domain.Balloon;

public class BalloonFactoryBean implements FactoryBean<Balloon>{

    @Override
    public Balloon getObject() throws Exception {
        return new Balloon("yellow");
    }

    @Override
    public Class<?> getObjectType() {
        return Balloon.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
