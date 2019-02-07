package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyComponent.class);

    @EventListener(condition = "#createdEvent.awesome")
    public void handleOrderCreatedEvent(OrderCreatedEvent createdEvent) {
        LOGGER.info("Awesome event handled");
    }

}
