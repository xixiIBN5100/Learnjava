package homework_02;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(20, 30);
        System.out.println("Area of rectangle1: " + rectangle1.getArea());
        System.out.println("Perimeter of rectangle1: " + rectangle1.getPerimeter());
        System.out.println("Drawing rectangle1:");
        rectangle1.drawRect();
        System.out.println();

        Rectangle rectangle2 = new Rectangle(15, 10);
        System.out.println("Area of rectangle2: " + rectangle2.getArea());
        System.out.println("Perimeter of rectangle2: " + rectangle2.getPerimeter());
        System.out.println("Drawing rectangle2:");
        rectangle2.drawRect();
    }
}

