package spring.di.demo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("heavy")
public class HeavyCalculationHeavyImpl implements HeavyCalculation {

    @Override
    public void calculate() {
        System.out.println("HeavyCalculationHeavyImpl#calculate");
    }
}
