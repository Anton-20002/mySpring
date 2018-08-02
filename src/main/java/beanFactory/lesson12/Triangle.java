package beanFactory.lesson12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;

/**
 * Created by Anton on 01.08.2018.
 */

public class Triangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;

// не работает без аннотации класса Component
//    private ResourceBundleMessageSource messageSource;
//
//    public ResourceBundleMessageSource getMessageSource() {
//        return messageSource;
//    }
//    @Autowired
//    public void setMessageSource(ResourceBundleMessageSource messageSource) {
//        this.messageSource = messageSource;
//    }


    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw(){
        System.out.println("Triangle drawen...");
        System.out.println("PointA: "+pointA.getX()+", \t"+pointA.getY());
        System.out.println("PointB: "+pointB.getX()+", \t"+pointB.getY());
        System.out.println("PointC: "+pointC.getX()+", \t"+pointC.getY());
//        System.out.println(messageSource.getMessage
//                ("test",null,"Default message",null));
    }
}
