package jonibek.io.design_patterns.structural.facade;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw : " + getClass().getSimpleName());
    }
}
