package com.example;

public class MyNameMessageService implements MessageService {
    public String message = "Mikołaj Wach";

    @Override
    public String getMessage() {
        return message;
    }
}
