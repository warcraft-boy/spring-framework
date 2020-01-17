package org.springframework.test.model;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @Description: <br>
 * @Date: Created in 2020/1/17 <br>
 * @Author: chenjianwen
 */
@Component
@Lazy
public class RunningMan {

	public RunningMan(){
		System.out.println("我lazy，所以我没被初始化");
	}
}
