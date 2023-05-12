package com.spring.factorial;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

// Ⱦ�ܰ��ɻ縦 ó���� �� Ŭ����
@Component
@Aspect
public class TimeAspect {
	
	@Around(value ="execution(* com.spring.factorial..*(..))")
	public Object measure(ProceedingJoinPoint pjp) {	
		long start = System.nanoTime();
		Object obj=null;
		try {
			obj = pjp.proceed();	// �ֵȰ��ɻ� ó���ϴ� �κ�
		} catch (Throwable e) {
			e.printStackTrace();
		}finally{
			long end = System.nanoTime();
			System.out.println("�ɸ��ð� : "+(end-start));
		}
		return obj;
	}
}
