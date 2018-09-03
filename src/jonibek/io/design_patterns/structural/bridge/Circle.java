package jonibek.io.design_patterns.structural.bridge;

public class Circle extends Shape {

    private int radius,x,y;

    public Circle( int x, int y, int radius, DrawApi drawApi) {
        super(drawApi);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius,x,y);
    }
}
