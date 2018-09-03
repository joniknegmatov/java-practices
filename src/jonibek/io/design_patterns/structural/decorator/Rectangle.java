package jonibek.io.design_patterns.structural.decorator;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing : " + getClass().getSimpleName());
    }
}
