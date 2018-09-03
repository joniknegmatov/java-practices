package jonibek.io.design_patterns.creational.prototype;

public class Square extends Shape {

    public Square() {
        type = getClass().getSimpleName();
    }

    @Override
    void draw() {
        System.out.println("Inside " + getClass().getSimpleName()  +"::draw() method.");
    }

}
