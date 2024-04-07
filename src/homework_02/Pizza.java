package homework_02;

import java.util.Scanner;

// 披萨类
class Pizza {
    protected String name;
    protected double price;
    protected String size;

    // 构造方法
    public Pizza(String name, double price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    // 显示披萨属性信息
    public void displayPizzaInfo() {
        System.out.println("披萨名称：" + name);
        System.out.println("披萨价格：" + price);
        System.out.println("披萨大小：" + size);
    }
}

