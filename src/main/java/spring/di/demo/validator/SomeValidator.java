package spring.di.demo.validator;

public class SomeValidator implements Validator {

    public void validate(String data) {
        System.out.println("SomeValidator#validate --- data = " + data);
    }

}
