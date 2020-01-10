package org.springframework.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.model.User;

/**
 * @Description: <br>
 * @Date: Created in 2020/1/10 <br>
 * @Author: chenjianwen
 */
public class SpringTest {

	@Test
	public void test01(){
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(User.class);
		User user = (User) ac.getBean("user");
		user.setName("chen");
		user.setAge(18);
		System.out.println(user.toString());
	}
}
