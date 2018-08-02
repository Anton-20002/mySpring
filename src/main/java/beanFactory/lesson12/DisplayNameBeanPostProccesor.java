package beanFactory.lesson12;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by Anton on 02.08.2018.
 */
public class DisplayNameBeanPostProccesor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Before initializing method. Bean name is "+beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("After initializing method. Bean name is "+beanName);
        return bean;
    }
}
