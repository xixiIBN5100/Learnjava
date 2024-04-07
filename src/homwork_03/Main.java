package homwork_03;

public class Main {
    public static void main(String[] args) {
        // 创建一个 Circle 对象
        Circle circle = new Circle();
        circle.setRadius(5); // 设置半径为 5

        // 输出 Circle 对象的属性和计算的面积、周长
        System.out.println("Circle:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Color: " + circle.getColor()); // 继承自父类 GeometricObject

        // 创建一个 Rectangle 对象
        Rectangle rectangle = new Rectangle(3, 4); // 宽度为 3，高度为 4

        // 输出 Rectangle 对象的属性和计算的面积、周长
        System.out.println("\nRectangle:");
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Color: " + rectangle.getColor()); // 继承自父类 GeometricObject
    }
}
