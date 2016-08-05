package io.khasang.qb.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hello {
    @Autowired
    Message message;


    /*public Hello(Message message) {
        this.message = message;
    }*/

    public Hello() {

    }

    public String getHello(){
        return message.getMessage();
    }
}
