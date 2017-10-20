package spring.di.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class HeavyCalculationLightImpl implements HeavyCalculation {

    @Override
    public void calculate() {
        System.out.println("HeavyCalculationLightImpl#calculate");
    }
}
