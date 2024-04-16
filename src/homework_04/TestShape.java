package homework_04;

// 测试类 TestShape
public class TestShape {
    public static void main(String[] args) {
        // 创建一个三角形对象
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        // 检查三角形的三条边是否能构成三角形
        if (isValidTriangle(triangle)) {
            // 输出三角形的面积和周长，保留两位小数
            System.out.printf("Triangle - Area: %.2f, Circumference: %.2f%n", triangle.area(), triangle.circumference());
        } else {
            System.out.println("Triangle sides cannot form a valid triangle.");
        }

        // 创建一个长方形对象
        Rectangle rectangle = new Rectangle(4.0, 5.0);

        // 输出长方形的面积和周长，保留两位小数
        System.out.printf("Rectangle - Area: %.2f, Circumference: %.2f%n", rectangle.area(), rectangle.circumference());
    }

    // 辅助方法：判断三条边是否能构成三角形
    private static boolean isValidTriangle(Triangle triangle) {
        double a = triangle.side1;
        double b = triangle.side2;
        double c = triangle.side3;

        return a + b > c && a + c > b && b + c > a;
    }
}

