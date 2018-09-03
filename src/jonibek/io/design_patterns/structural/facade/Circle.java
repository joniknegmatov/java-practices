package jonibek.io.design_patterns.structural.facade;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw : " + getClass().getSimpleName());
    }
}
