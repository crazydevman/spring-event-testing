package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyComponent.class)
public class DemoApplicationTests {

	@Autowired
	private ApplicationEventPublisher publisher;
	@MockBean
	private MyComponent myComponent;

	@Test
	public void handleOrderCreatedEvent_shouldExecute_whenAwesome() {
		OrderCreatedEvent event = new OrderCreatedEvent(true);
		publisher.publishEvent(event);
		verify(myComponent).handleOrderCreatedEvent(event);
	}

	@Test
	public void handleOrderCreatedEvent_shouldNotExecute_whenNotAwesome() {
		OrderCreatedEvent event = new OrderCreatedEvent(false);
		publisher.publishEvent(event);
		verify(myComponent, times(0)).handleOrderCreatedEvent(event);
	}

}

