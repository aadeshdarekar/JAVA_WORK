package com.example.demo;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource; 

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringContainer1Application {

		 public static void main(String[] args) {
			 XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("Bean.xml"));
			 HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
			 obj.getMessage();
			 }
		//SpringApplication.run(SpringContainer1Application.class, args);
	}
