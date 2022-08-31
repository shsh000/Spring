package co.hee.prj.aop;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component // IoC 컨테이너에 bean 등록
@Aspect // AOP가 수행할 클래스
public class AopAdvice {
	// PointCut 설정
	@Pointcut("execution(* co.hee.prj..*Impl.*(..))")
	public void allPoint() {
		
	}
	
	// Weaving 설정 => 포인트컷이 동작할 시점
	// getSignature() : 클라이언트가 호출한 메소드의 시그니처(리턴타입, 이름, 매개변수) 정보가 저장된 Signature 객체 리턴
	// getName() : 클라이언트가 호출한 메소드 이름 리턴
	@Before("allPoint()")
	public void beforeLog(JoinPoint jp) { // Advice => 수행하는 메소드
		Date date = new Date(); // java 8부터 LocalDate 객체 사용하기를 권장
		String runMethod = jp.getSignature().getName();
		System.out.println(runMethod + " 시작시간 = " + date);
	}
	
	@After("allPoint()")
	public void endLog(JoinPoint jp) {
		Date date = new Date();
		String runMethod = jp.getSignature().getName();
		System.out.println(runMethod + " 종료시간 = " + date);
	}
	
	
//	public void endLog() {
//		System.out.println("메소드 종료");
//	}
}
