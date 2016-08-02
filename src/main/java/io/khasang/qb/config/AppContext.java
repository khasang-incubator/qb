package io.khasang.qb.config;

import io.khasang.qb.model.Hello;
import io.khasang.qb.model.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {
    @Bean
    public Message message() {
        return new Message("Hello");
    }

    @Bean
    public Hello hello(){
        return new Hello(message());
    }
}
