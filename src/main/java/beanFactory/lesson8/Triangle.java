package beanFactory.lesson8;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Date;

/**
 * Created by Anton on 01.08.2018.
 */
public class Triangle implements ApplicationContextAware, BeanNameAware{
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private ApplicationContext context=null;
    private static int count;
    private int id;
    String s;
    public Triangle(){
        count++;
        id=count;
    }

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
        System.out.println(getClass().getSimpleName()+id);
        System.out.println(new Date().toString());
    }

    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;
        System.out.println("StartInnerContext");
        System.out.println(new Date().toString());

    }

    public ApplicationContext getContext() {
        return context;
    }

    public void setBeanName(String beanName) {

        s = beanName+id;

    }
    String getBeanName(){
        System.out.println(s);
        return s;
    }
}
