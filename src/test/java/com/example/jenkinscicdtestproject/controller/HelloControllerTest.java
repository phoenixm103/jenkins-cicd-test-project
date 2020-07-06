package com.example.jenkinscicdtestproject.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URI;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@SpringBootTest
class HelloControllerTest {

	
	private TestRestTemplate restTemplate=new TestRestTemplate() ;
	
	@Test
	//@DisplayName("/hello rest api test ")
	void testMessage() {
	     
//		String user = "Peter";
//		URI targetUrl= UriComponentsBuilder.fromUriString("/hello")                             
//	            .queryParam("user", user)                               
//	            .build()                                                
//	            .encode()                                               
//	            .toUri();
//	     
//		String message = this.restTemplate.getForObject(targetUrl, String.class);
//		assertEquals("Hello "+user+", Thanks for the subscription!", message);
	}

}
