package com.cg.iocdemo1;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

public static void main(String[] args) {
		// TODO Auto-generated method stub

ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
Employee emp = context.getBean("employee", Employee.class);

		System.out.println("Employee Details");
		System.out.println("-------------------------------------------");
		System.out.println("Employee ID :" + emp.getEmployeeId());
		System.out.println("Employee Name :" + emp.getEmployeeName());
		System.out.println("Employee Salary :" + emp.getSalary());
		System.out.println("Employee BU :" + emp.getBusinessUnit());
		System.out.println("Employee Age :" + emp.getAge());

		

	}

}
