package beanFactory.lesson15;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * Created by Anton on 02.08.2018.
 */

public class Circle implements Shape, ApplicationEventPublisherAware {
    private Point point;
    private ApplicationEventPublisher publisher;

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
        DrawEvent drawEvent = new DrawEvent(this);
        publisher.publishEvent(drawEvent);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }
}
