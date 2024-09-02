package ex05.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CalcMain {
	public static void main(String[] args) {
		ApplicationContext cont = 
				new ClassPathXmlApplicationContext("classpath:ex05/aop/appCtx.xml");
//				new GenericXmlApplicationContext("ex05/aop/appCtx.xml");
		
		ICalc proxyCal = cont.getBean("calc",ICalc.class);
		
		System.out.println(proxyCal.add(3, 4));
		System.out.println(proxyCal.mul(3, 4));
		System.out.println(proxyCal.sub(12, 3, 4));
	}
}
