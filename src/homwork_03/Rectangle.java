package homwork_03;

public class Rectangle extends GeometricObject{
    private double width;
    private double height;
    private String color;
    private boolean filled;


    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * 获取
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * 设置
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * 获取
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return "Rectangle{width = " + width + ", height = " + height + "}";
    }

    @Override
    public double getPerimeter() {
        return 2*(height + width);
    }

    @Override
    public double getArea() {
        return height * width;
    }
}
