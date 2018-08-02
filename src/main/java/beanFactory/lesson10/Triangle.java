package beanFactory.lesson10;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by Anton on 01.08.2018.
 */
public class Triangle implements InitializingBean, DisposableBean{
    private Point pointA;
    private Point pointB;
    private Point pointC;

public void myInit(){
    System.out.println("My init method is called.");
}
public void clean(){
    System.out.println("Clean up method is called.");
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
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean is init!");
    }

    public void destroy() throws Exception {
        System.out.println("Disposobale bean start");
    }
}
