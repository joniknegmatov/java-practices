package jonibek.io.design_patterns.structural.bridge;

public abstract class Shape {

    protected DrawApi drawApi;

    public Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
