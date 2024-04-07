package homwork_03;

public class Circle extends GeometricObject {
    private double radius;
    private String color;
    private boolean filled;
    public Circle(){
        radius = 1;
        color = "黄色";
        filled = false;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter(){
        return 2*radius;
    }

    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*radius;
    }
}
