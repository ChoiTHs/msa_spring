package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.JavaClientConfig;
import model.Client;

/*
public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new AnnotationConfigApplicationContext(JavaClientConfig.class);
		
		Client c = ctx.getBean("client",Client.class);
		c.setHost("서버야!!!");
		c.send();
	}
}
*/
public class ClientMain {
	public static void main(String[] args) {
//		ApplicationContext ctx = 
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(JavaClientConfig.class);
		
		Client c = ctx.getBean("client",Client.class);
		c.setHost("서버야!!!");
		c.send();
		Client c2 = ctx.getBean("client",Client.class);
		c2.setHost("default host!!!");
		c2.send();
		
		ctx.close();
	}
}
