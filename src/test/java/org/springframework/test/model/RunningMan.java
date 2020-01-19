package org.springframework.test.model;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @Description: <br>
 * @Date: Created in 2020/1/17 <br>
 * @Author: chenjianwen
 */
@Component
@Lazy //设置成lazy模式，spring不会创建该bean,也就不会加载该类的构造器
public class RunningMan {

	public RunningMan(){
		System.out.println("我lazy，所以我没被初始化；如果我出现了，那么我的lazy在某个地方被修改了");
	}
}
