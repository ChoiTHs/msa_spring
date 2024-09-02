package ex05.aop;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;

public class LogPrintAfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(
			Object returnValue, Method method, Object[] args, Object target) 
					throws Throwable {
		System.out.println("AfterReturningAdvice Start...");
		
		Log log = LogFactory.getLog(this.getClass());
		log.info("[주업무 실행되고 돌아와서 실행]");
		System.out.println("[AfterReturning Method]" + method.getName());
		System.out.println("[ReturnValue]"+returnValue);
		System.out.println("[args Values]"+Arrays.toString(args));
	}

}
