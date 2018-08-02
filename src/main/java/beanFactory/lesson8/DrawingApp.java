package beanFactory.lesson8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Anton on 01.08.2018.
 */
public class DrawingApp {
    public static void main(String[] args) throws InterruptedException {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-lesson8.xml");
        Triangle triangle = (Triangle) context.getBean("triangle");
        ApplicationContext app = triangle.getContext();
        Triangle t = (Triangle) app.getBean("triangle");
        t.draw();
        t.getBeanName();
        Thread.sleep(1000);
        triangle.draw();
        triangle.getBeanName();
        context.registerShutdownHook();

    }
}
