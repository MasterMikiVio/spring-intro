package com.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("messageService")
public class MyNameMessageService implements MessageService {
    public String message = "Mikołaj Wach";

    @Override
    public String getMessage() {
        return message;
    }
}
