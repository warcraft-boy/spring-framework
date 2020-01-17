package org.springframework.test.model;

import org.springframework.core.type.Scope;
import org.springframework.stereotype.Component;

/**
 * @Description: <br>
 * @Date: Created in 2020/1/10 <br>
 * @Author: chenjianwen
 */
@Component
@Scope(value = "prototype")
public class User {

	private String name;
	private int age;

	public User(){
		System.out.println("我不lazy，所以我被初始化了");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
