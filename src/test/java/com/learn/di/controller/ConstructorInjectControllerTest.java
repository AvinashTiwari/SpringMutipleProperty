package com.learn.di.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.learn.di.services.GreetingServiceImpl;

public class ConstructorInjectControllerTest {

private ConstructorInjectionController constructorInjectionController;
	
	@Before
	public void setup(){
		this.constructorInjectionController = new ConstructorInjectionController(new GreetingServiceImpl());
		
	}
	
	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO, constructorInjectionController.sayHello());
	}

}
