package com.learn.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.learn.di.services.*;

@Controller
public class GetterInjectionController {
	
private GreetingService greetingService;
	
public	String SayHello()
	{
		return greetingService.sayGreeting();
	}
	
@Autowired
	public void settGreetingService(@Qualifier("getterGrettingService") GreetingService greetingService)
	{
		this.greetingService = greetingService;
	}
}
