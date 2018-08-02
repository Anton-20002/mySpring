package beanFactory.lesson9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-lesson9.xml");
        AnotherTriangle triangle1 = (AnotherTriangle) context.getBean("AnotherTriangle1");
        triangle1.draw();
        System.out.println("****************************************");
        AnotherTriangle triangle2 = (AnotherTriangle) context.getBean("AnotherTriangle2");
        triangle2.draw();
        System.out.println("****************************************");
        Triangle triangle3 = (Triangle) context.getBean("triangle2");
        triangle3.draw();


    }
}
