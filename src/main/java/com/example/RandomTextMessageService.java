package com.example;
import java.util.Random;

public class RandomTextMessageService implements MessageService {
    public String[] messageArray = {"Mikołaj Wach","Option 2","Option 3","Option 4",
            "Option 5","Option 6","Option 7","Option 8","Option 9","Option 10"};

    @Override
    public String getMessage() {
        Random rand = new Random();
        return messageArray[rand.nextInt(10)];
    }
}
