package beanFactory.lesson9;

import java.util.Set;

/**
 * Created by Anton on 02.08.2018.
 */
public class AnotherTriangle {
    Set <Point> points;

    public Set<Point> getPoints() {
        return points;
    }

    public void setPoints(Set<Point> points) {
        this.points = points;
    }
    public void draw(){
        for (Point p:points) {
            System.out.println("Point: "+p.getX()+",\t"+p.getY());
        }
    }
}
