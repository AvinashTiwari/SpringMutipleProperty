package com.learn.di.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGrettingService implements GreetingService {

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello I was injected by the getter";
	}

}
