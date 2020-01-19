package org.springframework.test.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @Description: 对于设置成@Lazy的类，由于其构造器不被加载，这里可以自定义使其被加载，起到修改bean定义的属性
 * @Date: Created in 2020/1/19 <br>
 * @Author: chenjianwen
 */
@Component
public class SelfDefinationBeanFactoryPostProccessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition("runningMan");
		genericBeanDefinition.setLazyInit(false);
	}
}
