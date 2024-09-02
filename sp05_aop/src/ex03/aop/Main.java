package ex03.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		String conf = "ex03/aop/appCtx.xml";
		
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext(conf);
		
		ICalc proxy = ctx.getBean("proxy", ICalc.class);
		
		System.out.println(proxy.sub(1, 2, 3));
		System.out.println(proxy.add(3, 4));
		System.out.println(proxy.mul(3, 4));
	}
}
