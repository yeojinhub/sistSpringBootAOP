package kr.co.sist.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloAOP {

//	@Before("execution(String kr.co.sist.day0630.TestDAO.selectName(String))")
//	@Before("execution(String kr.co.sist.day0630.TestService.searchName(String))")
//	@Before("execution(* kr.co.sist.day0630.*.*(..))")
	public void beforeAdvice(JoinPoint jp) {
		// 공통코드 작성
		System.out.println("[AOP] : beforeAdvice");
	} //beforeAdvice
	
} //class
