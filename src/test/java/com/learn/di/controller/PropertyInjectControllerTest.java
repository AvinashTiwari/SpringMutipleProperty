package com.learn.di.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.learn.di.services.GreetingServiceImpl;

public class PropertyInjectControllerTest {

	private PropertyInjectionController propertyInjectionController;
	
	@Before
	public void setup(){
		this.propertyInjectionController = new PropertyInjectionController();
	}
	
	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO, propertyInjectionController.SayHello());
	}

}
