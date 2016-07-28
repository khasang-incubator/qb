package io.khasang.qb.model;

public class Message {
    private String messageText;

    public Message(String message) {
        this.messageText = message;
    }

    public String getMessage() {
        return messageText;
    }

    public void setMessage(String message) {
        this.messageText = message;
    }
}
