package beanFactory.lesson2;

/**
 * Created by Anton on 01.08.2018.
 */
public class Triangle {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void draw(){
        System.out.println(type+" Triangle drawen...");
    }
}
