package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.JavaClient2Config;
import model.Client2;

public class Client2Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(JavaClient2Config.class);
		
		Client2 c = ctx.getBean("client2",Client2.class);
		Client2 c2 = ctx.getBean("client2",Client2.class);
		
		c.send();
		System.out.println(c.hashCode());
		System.out.println(c2.hashCode());
		
		ctx.close();
	}
}
