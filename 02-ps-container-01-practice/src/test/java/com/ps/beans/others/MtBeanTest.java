package com.ps.beans.others;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;

/**
 * Created by iuliana.cosmina on 3/26/16.
 */
public class MtBeanTest {

    private Logger logger = LoggerFactory.getLogger(MtBeanTest.class);

    @Test
    public void testConfig() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/others/sample-config-01.xml");

        MultipleTypesBean mtBean = (MultipleTypesBean) ctx.getBean("mtBean");
        assertNotNull(mtBean);
    }

    @Test
    public void testWildcard() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/others/*-cfg.xml");

        MultipleTypesBean mtBean = (MultipleTypesBean) context.getBean("mtBean");
        assertNotNull(mtBean);
    }
}
