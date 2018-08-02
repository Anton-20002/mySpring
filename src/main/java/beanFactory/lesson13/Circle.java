package beanFactory.lesson13;

/**
 * Created by Anton on 02.08.2018.
 */
public class Circle implements Shape {
    private Point point;

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    @Override
    public void draw() {
        System.out.println("Circle drawen...");
        System.out.println("Center point:" + point.getX()+",\t"+point.getY());
    }
}
