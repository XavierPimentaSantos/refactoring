package pt.up.fe.ldts.example2;

public abstract class Shape {
    private double x;
    private double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getX(){
        return x;
    }

    double getY(){
        return y;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void draw(GraphicFramework graphics);
}
