package beanFactory.lesson3;

/**
 * Created by Anton on 01.08.2018.
 */
public class Triangle {
    private String type;
    int height;

    public Triangle(String type, int height) {
        this.type = type;
        this.height=height;
    }

    public Triangle(int height) {
        this.height = height;
    }

    public Triangle(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }



    public void draw(){
        System.out.println(type+" Triangle drawen with heigth: "+height);
    }
}
