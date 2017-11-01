package com.learn.di.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{
  public static final String HELLO = "Hello Avinash";
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return HELLO;
	}

}
