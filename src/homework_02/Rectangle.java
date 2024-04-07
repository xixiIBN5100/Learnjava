package homework_02;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        if (isValidDimension(width) && isValidDimension(height)) {
            this.width = width;
            this.height = height;
        } else {
            System.out.println("Invalid dimensions. Width and height must be between 10 and 50.");
        }
    }

    private boolean isValidDimension(int dimension) {
        return dimension >= 10 && dimension <= 50;
    }

    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }

    public void drawRect() {
        int drawnWidth = (int) width; // 取整数部分作为绘制宽度
        int drawnHeight = (int) height; // 取整数部分作为绘制高度

        for (int i = 0; i < drawnHeight; i++) {
            for (int j = 0; j < drawnWidth; j++) {
                if (i == 0 || i == drawnHeight - 1 || j == 0 || j == drawnWidth - 1) {
                    System.out.print("*"); // 绘制矩形的边框
                } else {
                    System.out.print(" "); // 绘制矩形内部为空白
                }
            }
            System.out.println(); // 换行
        }
    }
}


