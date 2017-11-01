package com.learn.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.learn.di.services.GreetingService;

@Controller
public class ConstructorInjectionController {
	
	private GreetingService greetingService;

	public ConstructorInjectionController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello()
	{
		return greetingService.sayGreeting();
	}

	
}
