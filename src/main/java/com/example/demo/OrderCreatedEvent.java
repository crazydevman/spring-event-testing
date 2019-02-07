package com.example.demo;

public class OrderCreatedEvent {

    public OrderCreatedEvent(boolean awesome) {
        this.awesome = awesome;
    }

    private boolean awesome;

    public boolean isAwesome() {
        return awesome;
    }
}
