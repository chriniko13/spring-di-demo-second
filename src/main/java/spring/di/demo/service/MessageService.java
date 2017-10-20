package spring.di.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Value("${display.message}")
    private boolean displayMessage;

    @Value("${message.to.display}")
    private String message;

    public void foo() {
        if (displayMessage)
            System.out.println("MessageService#foo --- message: " + message);
    }

}
