package pt.up.fe.ldts.example2;

public class Circle extends Shape{

    private final double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    @Override
    public void draw(GraphicFramework graphics){
        graphics.drawCircle(getX(), getY(), radius);
    }
}
