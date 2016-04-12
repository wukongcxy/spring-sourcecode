package com.wukong.collections;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by chenxinyue on 2016/4/12.
 */
public class BeanFactoryTest {
    public static void main(String[] args) {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
        MyTestBean bean = bf.getBean("myTestBean", MyTestBean.class);
        bean.sayHello();

    }
}
