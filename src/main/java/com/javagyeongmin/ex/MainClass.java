package com.javagyeongmin.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(); // 컨테이너 생성
		
		ctx.load("classpath:applicationCTX.xml"); // 컨테이너 설정
		ctx.refresh(); // 컨테이너 설정
		
		Student student = ctx.getBean("student", Student.class); // 컨테이너 사용
		System.out.println(student.getName()); // 컨테이너 사용
		System.out.println(student.getAge()); // 컨테이너 사용

		// student 빈만 소멸시키고 싶을 때는 아래와 같이함 student.destroy(); 작성하면 try/catch문 써야됨
//		try {
//			student.destroy();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		ctx.close(); // 컨테이너 종료 (빈도 같이 종료)
	}

}
