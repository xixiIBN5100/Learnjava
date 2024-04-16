package homework_04;

interface VolumeArea {
    static final double PI = 3.14159;

    double volume(double radius);
    double area(double radius);
}

class MyCircle implements VolumeArea {

    @Override
    public double volume(double radius) {

        return 0;
    }

    @Override
    public double area(double radius) {

        return PI * radius * radius;
    }
}

class MySphere implements VolumeArea {

    @Override
    public double volume(double radius) {
        // Volume of a sphere = (4/3) * π * r^3
        return (4.0/3.0) * PI * radius * radius * radius;
    }

    @Override
    public double area(double radius) {
        // Surface area of a sphere = 4 * π * r^2
        return 4 * PI * radius * radius;
    }
}

public class VolumeAreaTest {
    public static void main(String[] args) {
        double radius = 3.5;

        MyCircle circle = new MyCircle();
        double circleArea = circle.area(radius);
        System.out.println("Area of the circle with radius " + radius + ": " + circleArea);
        MySphere sphere = new MySphere();
        double sphereVolume = sphere.volume(radius);

        double sphereArea = sphere.area(radius);

        System.out.println("Volume of the sphere with radius " + radius + ": " + sphereVolume);
        System.out.println("Surface area of the sphere with radius " + radius + ": " + sphereArea);
    }
}

