package kr.co.sist.day0701;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class TestAdviceService {

	public String before(String msg) {
		System.out.println("[Service] before : "+msg);
		
		return "오늘은 화요일입니다.";
	} //before
	
	public String afterReturning(String msg) {
		System.out.println("[Service] afterReturning : "+msg);
		
		return "내일은 수요일입니다.";
	} //afterReturning
	
	public String afterThrowing(String msg) throws Exception {
		System.out.println("[Service] afterThrowing : "+msg);
		
		if(new Random().nextBoolean()) {
			throw new Exception("예외 발생");
		} //end if
		
		return "스프링 프레임워크 첫 걸음";
	} //afterThrowing
	
	public String around(String msg) {
		int cnt = new Random().nextInt(100);
		
		for(int i=0; i<cnt; i++) {
			System.out.println("[Service] around : "+msg+"/"+cnt);
		} //end for
		
		return "AWS(Paas, Iaas, Saas)인프라 구축 가이드";
	} //around
	
} //class
