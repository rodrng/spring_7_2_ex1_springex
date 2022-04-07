package com.javagyeongmin.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(); // �����̳� ����
		
		ctx.load("classpath:applicationCTX.xml"); // �����̳� ����
		ctx.refresh(); // �����̳� ����
		
		Student student = ctx.getBean("student", Student.class); // �����̳� ���
		System.out.println(student.getName()); // �����̳� ���
		System.out.println(student.getAge()); // �����̳� ���

		// student �� �Ҹ��Ű�� ���� ���� �Ʒ��� ������ student.destroy(); �ۼ��ϸ� try/catch�� ��ߵ�
//		try {
//			student.destroy();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		ctx.close(); // �����̳� ���� (�� ���� ����)
	}

}
