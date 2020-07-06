package com.example.jenkinscicdtestproject.service;

import org.springframework.stereotype.Component;

@Component
public class MessageService {
	  
	   
	public String getSubscriptionMessage(String user) {
	 
		return "Hello "+user+", Thanks for the subscription!"; 
	}
	  
	public int add(int a, int b) {
		
		int sum=a+b;
		return sum;
	}
	//this is a demo change in source code to check if jenkins fetching data automatically or not 
	
}
