package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.impl.MemberDaoImpl;
import dao.impl.PorderDaoImpl;

public class TestController {

	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("applicationContext.xml");

		MemberDaoImpl mdi = a.getBean("MDI", MemberDaoImpl.class);
		PorderDaoImpl pdi = a.getBean("PDI", PorderDaoImpl.class);

		mdi.selectAll().forEach(action -> {
			System.out.println(action.getName());
		});
	}

}