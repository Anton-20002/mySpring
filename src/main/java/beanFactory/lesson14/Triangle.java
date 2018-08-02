package beanFactory.lesson14;

import org.springframework.beans.factory.annotation.Required;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Created by Anton on 01.08.2018.
 */
public class Triangle implements Shape{
    private Point pointA;
    private Point pointB;
    private Point pointC;


    
    public Point getPointA() {
        return pointA;
    }

//    если не указывать имя для аннотации Resource то будет искать согласно названию поля
    @Resource (name = "point1")
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

//    вызывается всегда даже при вызове другого класса
    @PostConstruct
    public void initTriangle(){
        System.out.println("Init method for Triangle");
    }
    //    вызывается всегда даже при вызове другого класса
    @PreDestroy
    public void destroyTriangle(){
        System.out.println("Destroy method for Triangle");
    }

    @Override
    @Required
    public void draw(){
        System.out.println("Triangle drawen...");
        System.out.println("PointA: "+ pointA.getX()+", \t"+ pointA.getY());
        System.out.println("PointB: "+pointB.getX()+", \t"+pointB.getY());
        System.out.println("PointC: "+pointC.getX()+", \t"+pointC.getY());
    }
}
