package beanFactory.lesson7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Anton on 01.08.2018.
 */
public class DrawingApp {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-lesson7.xml");
        Triangle triangle = (Triangle) context.getBean("triangle");
        triangle.draw();


    }
}
