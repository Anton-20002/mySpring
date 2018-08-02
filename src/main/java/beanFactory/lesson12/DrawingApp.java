package beanFactory.lesson12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by Anton on 01.08.2018.
 */
public class DrawingApp {
    public static void main(String[] args) throws IOException {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-lesson12.xml");
        context.registerShutdownHook();
        Triangle triangle = (Triangle) context.getBean("triangle");
        triangle.draw();

        Resource resource = new ClassPathResource("pointsconfig.properties");
        Properties props = PropertiesLoaderUtils.loadProperties(resource);
        System.out.println(props.stringPropertyNames());

        MessageSource messageSource = (MessageSource) context.getBean("messageSource");
        System.out.println(messageSource.getMessage
                ("test", null, "Default message",null));



    }
}
