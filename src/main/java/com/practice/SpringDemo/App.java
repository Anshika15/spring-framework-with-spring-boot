package com.practice.SpringDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App 
{
    public static void main( String[] args )
    {
//    	BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
    	ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = (Alien)factory.getBean("alien");
        obj.code();
        obj.age = 15;
        System.out.println(obj.age);
        
        Alien obj2 = (Alien)factory.getBean("alien");
        obj2.code();
        System.out.println(obj2.age);
    }
}
