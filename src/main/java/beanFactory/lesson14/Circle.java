package beanFactory.lesson14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by Anton on 02.08.2018.
 */
public class Circle implements Shape {
    private Point p;

    public Point getPoint() {
        return p;
    }


    @Autowired
    @Qualifier (value = "center")
    public void setPoint(Point p) {
        this.p = p;
    }

    @Override
    public void draw() {
        System.out.println("Circle drawen...");
        System.out.println("Center point:" + p.getX()+",\t"+ p.getY());
    }
}
