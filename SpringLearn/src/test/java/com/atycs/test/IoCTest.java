package com.atycs.test;

import com.atycs.IoC.XxxController;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class IoCTest {
    @Test
    public void test01() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        XxxController xxxController = applicationContext.getBean(XxxController.class);
        xxxController.getMessage();
    }
}
