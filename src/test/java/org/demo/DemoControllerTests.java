package org.demo;

import org.demo.controller.DemoController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertSame;

@ExtendWith(MockitoExtension.class)
public class DemoControllerTests {

	@InjectMocks
	private DemoController controller;

	@Test
	public void getHelloTest() throws Exception {
		ResponseEntity<String> response = controller.getServerHello();
		assertSame("Hello, world!", response.getBody());
		assertSame(HttpStatus.OK, response.getStatusCode());
	}

}