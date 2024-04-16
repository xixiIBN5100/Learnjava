package homework_04;

// 三角形类 Triangle 实现接口 Shape
class Triangle implements Shape {
    double side1;
    double side2;
    double side3;

    // 构造方法，初始化三角形的三条边
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // 实现接口中的方法：计算三角形的面积
    public double area() {
        // 使用海伦公式计算面积
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // 实现接口中的方法：计算三角形的周长
    public double circumference() {
        return side1 + side2 + side3;
    }
}

