package homework_02;

import java.util.Scanner;

// 海鲜披萨类，继承自披萨类
class SeafoodPizza extends Pizza {
    private String ingredients; // 配料信息

    // 构造方法
    public SeafoodPizza(String name, double price, String size, String ingredients) {
        super(name, price, size);
        this.ingredients = ingredients;
    }

    // 显示海鲜披萨属性信息
    @Override
    public void displayPizzaInfo() {
        super.displayPizzaInfo();
        System.out.println("配料信息：" + ingredients);
    }
}

