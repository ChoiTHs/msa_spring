package ex04.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

// xml 기판 pojo방식의 AspectJ를 이용한 AOP 방법
public class LoggingAdvice {

//	Arround방식의 사전/후 처리 AOP 방식으로 할 때 
//	인수는 ProceedingJoinPoint, 리턴 - Object타입 
	public Object arround(ProceedingJoinPoint point) throws Throwable {
		
		String methodName = point.getKind();
		String methodName2 = point.getSignature().getName();
		
		System.out.println("[log] methodName = " + methodName + ", " + methodName2);
		
		StopWatch sw = new StopWatch();
		sw.start(methodName);
		//////주 관심사 코드/////////////////////////
		Object obj = point.proceed();// 실제 타겟 메소드가 실행되는 부분
		////////////////////////////////////////
		
		sw.stop(); // 시간측정 끝
		System.out.println("타이머 정지");

		System.out.println("[TimerLOG] " + methodName2 + "호출 완료"); 
		System.out.println("[TimerLOG] proecess Time : " + sw.getTotalTimeMillis()/1000+" sec");
		
		return obj;
	}
}
