package beanFactory.lesson6;

import java.util.List;

/**
 * Created by Anton on 01.08.2018.
 */
public class Triangle {
    List <Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }



    public void draw(){

        System.out.println("Triangle drawen...");

        for (Point p:points) {
            System.out.println("Point: "+p.getX()+", \t"+p.getY());
        }
    }
}
