package org.springframework.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.model.MainConfig;
import org.springframework.test.model.User;

/**
 * @Description: <br>
 * @Date: Created in 2020/1/10 <br>
 * @Author: chenjianwen
 */
public class SpringTest {

	@Test
	public void test01(){
		/**
		 * 这里加载MainConfig类，而MainConfig类中配置@Configuration和@ComponentScan(basePackages = {"org.springframework.test.model"})注解
		 * 使注解创建bean生效
		 */
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig.class);
		User user = ac.getBean(User.class);
		user.setName("chen");
		user.setAge(18);
		System.out.println(user);
	}
}
