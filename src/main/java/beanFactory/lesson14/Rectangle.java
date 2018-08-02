package beanFactory.lesson14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;


@Component
public class Rectangle implements Shape {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    private ResourceBundleMessageSource messageSource;

    public ResourceBundleMessageSource getMessageSource() {
        return messageSource;
    }
    @Autowired
    public void setMessageSource(ResourceBundleMessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public Point getPoint1() {
        return point1;
    }
    @Autowired
    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }
    @Autowired
    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }
    @Autowired
    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public Point getPoint4() {
        return point4;
    }
    @Autowired
    public void setPoint4(Point point4) {
        this.point4 = point4;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle drawen...");
        System.out.println("PointA: "+ point1.getX()+", \t"+ point1.getY());
        System.out.println("PointB: "+point2.getX()+", \t"+point2.getY());
        System.out.println("PointC: "+point2.getX()+", \t"+point3.getY());
        System.out.println("PointD: "+point4.getX()+", \t"+point4.getY());
        System.out.println(messageSource.getMessage
                ("test",null, "Default", null));
        System.out.println(messageSource.getMessage(
                "drawingPoing", new Object[] {point1.getX(), point1.getY()} , "Default", null));

    }
}
