package com.learn.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.learn.di.services.GreetingService;
import com.learn.di.services.GreetingServiceImpl;

@Controller
public class PropertyInjectionController {
	@Autowired
	public GreetingService greetingServiceImpl;
	
	public String SayHello()
	{
		return greetingServiceImpl.sayGreeting();
	}
	
	
}
