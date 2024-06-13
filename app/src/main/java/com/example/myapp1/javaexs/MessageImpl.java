package com.example.myapp1.javaexs;

public class MessageImpl extends IMessage {
    @Override
    public void sendMessage() {
        System.out.println("sending message from impl");
    }
}
