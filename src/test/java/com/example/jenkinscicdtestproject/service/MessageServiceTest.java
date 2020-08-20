package com.example.jenkinscicdtestproject.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MessageServiceTest {
	  
	   private MessageService messageService=new MessageService();
	  
	   @Test
	   @DisplayName("Subscription message service test ")
	   void testSubscriptionMessage() {
	     
		   String user = "Moin";
	     
		   String message = messageService.getSubscriptionMessage(user);
		   assertEquals("Hello "+user+", Thanks for the subscription!", message);
	   }
	   
	   @Test
	   void testAddingTwoPositives() {
		   assertEquals(2, messageService.add(1, 1), "Add method should return the sum of two numbers");
	   }
}//change 
