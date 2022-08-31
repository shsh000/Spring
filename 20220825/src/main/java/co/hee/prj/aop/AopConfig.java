package co.hee.prj.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

// 자바기반 AOP 설정 방법
@Configuration // 환경설정파일
@EnableAspectJAutoProxy(proxyTargetClass = true) // proxyTargetClass가 존재
public class AopConfig {
	@Bean
	public AopAdvice beforeAdvice() {
		return new AopAdvice();
	}
}
