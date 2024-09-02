package ex01.annotJava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = 
//		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Cats catsInfo = ctx.getBean("catsInfo", Cats.class);
		catsInfo.getMyCatInfo();
		System.out.println("---------------------------------");
		MyCats cat2 = (MyCats)ctx.getBean("cat2");
		catsInfo.setMyCats(cat2);
		catsInfo.getMyCatInfo();
	}
}
