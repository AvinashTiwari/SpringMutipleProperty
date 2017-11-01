package com.learn.di.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.learn.di.services.GreetingServiceImpl;

public class GetterInjectControllerTest {

private GetterInjectionController getterInjectionController;
	
	@Before
	public void setup(){
		this.getterInjectionController = new GetterInjectionController();
		this.getterInjectionController.settGreetingService(new GreetingServiceImpl());
	}
	
	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO, getterInjectionController.SayHello());
	}
}
