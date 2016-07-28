package io.khasang.qb.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hello {
    private Message message;

    @Autowired
    public Hello(Message message) {
        this.message = message;
    }

    public String getHello(){
        return message.getMessage();
    }
}
