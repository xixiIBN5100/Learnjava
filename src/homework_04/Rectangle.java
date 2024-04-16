package homework_04;

// 长方形类 Rectangle 实现接口 Shape
class Rectangle implements Shape {
    private double width;
    private double height;

    // 构造方法，初始化长方形的宽和高
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 实现接口中的方法：计算长方形的面积
    public double area() {
        return width * height;
    }

    // 实现接口中的方法：计算长方形的周长
    public double circumference() {
        return 2 * (width + height);
    }
}
