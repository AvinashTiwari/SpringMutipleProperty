package com.learn.di.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

	@Override
	public String getEnglishGreeting() {
		// TODO Auto-generated method stub
		return "Hello from english";
	}

	@Override
	public String getSpanishGreeting() {
		// TODO Auto-generated method stub
		return "Hello from spanish";
	}

	@Override
	public String getGermanGreeting() {
		// TODO Auto-generated method stub
		return "Hello from german";
	}

}
