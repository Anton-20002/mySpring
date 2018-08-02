package beanFactory.lesson15;

import org.springframework.context.ApplicationEvent;

/**
 * Created by Anton on 02.08.2018.
 */
public class DrawEvent extends ApplicationEvent {
    public DrawEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "Event occured";
    }
}
