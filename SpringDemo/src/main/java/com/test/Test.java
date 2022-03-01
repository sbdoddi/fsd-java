package com.test;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		Resource rs = new ClassPathResource("appContext.xml");
		BeanFactory bn = new XmlBeanFactory(rs);
		Students st = (Students)bn.getBean("std");
		st.disp();

	}

}
