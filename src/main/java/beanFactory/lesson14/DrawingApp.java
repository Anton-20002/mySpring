package beanFactory.lesson14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {
    public static void main(String[] args) throws InterruptedException {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-lesson14.xml");
        context.registerShutdownHook();
//        Shape shape = (Shape) context.getBean("triangle");
//        Shape shape = (Shape) context.getBean("circle");
        Shape shape = (Shape) context.getBean("rectangle");
        shape.draw();
        Thread.sleep(1000);



    }
}
