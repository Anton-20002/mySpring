package beanFactory.lesson1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Created by Anton on 01.08.2018.
 */
public class DrawingApp {
    public static void main(String[] args) {

        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/spring-config.xml"));
        Triangle triangle = (Triangle) factory.getBean("triangle");
        triangle.draw();


    }
}
