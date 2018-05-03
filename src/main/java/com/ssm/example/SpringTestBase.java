package com.ssm.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.example.service.UserService;

@ContextConfiguration(locations = { "classpath:spring/spring-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTestBase extends AbstractJUnit4SpringContextTests{
	
	@Autowired
	private UserService userService;
	
	@Test
    public void testPing() {
		Integer value = userService.getValue();
        Assert.assertEquals(new Integer(100), value);
    }
	
}
