package com.bulb.FristSpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BulbService s=new BulbService();
        //System.out.println(s.askforbulb());
		
		try {
			ApplicationContext context=new ClassPathXmlApplicationContext("com/bulb/FristSpringApp/applicationContext.xml");
			System.out.println(context);
			BulbService b=(BulbService)context.getBean("bulb");
			System.out.println(b);
			BulbService b1=(BulbService)context.getBean("bulb");
			System.out.println(b1);
			BulbService b2=(BulbService)context.getBean("bulb");
			System.out.println(b2);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
