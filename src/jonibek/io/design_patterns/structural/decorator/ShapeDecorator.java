package jonibek.io.design_patterns.structural.decorator;

public abstract class ShapeDecorator implements Shape {

    Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }

}
