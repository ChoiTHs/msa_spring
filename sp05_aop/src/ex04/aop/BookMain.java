package ex04.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookMain {
	public static void main(String[] args) {
		ApplicationContext cont = 
				new ClassPathXmlApplicationContext("ex04/aop/ctx.xml");
		IMessageBean msg = cont.getBean("messageBeanImpl", IMessageBean.class);
		
		msg.sayHello();
		System.out.println("----------------------------");
		msg.engHello();
		System.out.println("\n\n----------------------------");
		IBookBean book = (IBookBean) cont.getBean("bookBeanImpl");
		book.testHello("msa-6th");
		System.out.println();
		book.korHello();
		
	}
}
