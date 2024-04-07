package homework_02;

import java.util.Scanner;

// 培根披萨类，继承自披萨类
class BaconPizza extends Pizza {
    private int baconWeight; // 培根克数

    // 构造方法
    public BaconPizza(String name, double price, String size, int baconWeight) {
        super(name, price, size);
        this.baconWeight = baconWeight;
    }

    // 显示培根披萨属性信息
    @Override
    public void displayPizzaInfo() {
        super.displayPizzaInfo();
        System.out.println("培根克数：" + baconWeight);
    }
}

