package pt.up.fe.ldts.example2;

public class Rectangle extends Shape{
    double width;
    double height;

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea(){
        return width * height;
    }

    @Override
    public double getPerimeter(){
        return 2*width + 2*height;
    }

    @Override
    public void draw(GraphicFramework graphics){
        graphics.drawLine(getX(), getY(), getX() + width, getY());
        graphics.drawLine(getX() + width, getY(), getX() + width, getY() + height);
        graphics.drawLine(getX() + width, getY() + height, getX(), getY() + height);
        graphics.drawLine(getX(), getY() + height, getX(), getY());
    }
}