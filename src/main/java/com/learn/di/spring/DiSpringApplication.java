package com.learn.di.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.learn.di.controller.ConstructorInjectionController;
import com.learn.di.controller.GetterInjectionController;
import com.learn.di.controller.MyController;
import com.learn.di.controller.PropertyInjectionController;
import com.learn.di.spring.examplebeans.FakeAvinashDataSource;
import com.learn.di.spring.examplebeans.FakeDataSource;

@SpringBootApplication
@ComponentScan("com.learn.di")
public class DiSpringApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiSpringApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		controller.hello();
		
		FakeDataSource fs = (FakeDataSource)ctx.getBean(FakeDataSource.class);
		System.out.println(fs.getUser());
		
		FakeAvinashDataSource fsAvinash = (FakeAvinashDataSource)ctx.getBean(FakeAvinashDataSource.class);
		System.out.println(fsAvinash.getUser());
	}
}
