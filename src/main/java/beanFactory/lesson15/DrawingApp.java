package beanFactory.lesson15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-lesson15.xml");
//        Shape triangle = (Shape) context.getBean("triangle");
        Shape circle = (Shape) context.getBean("circle");
        circle.draw();



    }
}
