package xsx;

public class Dog extends Animal {

    // 构造方法
    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    // 实现抽象方法
    @Override
    public void move() {
        System.out.println(name + " runs on the ground.");
    }

    @Override
    public void eat() {
        System.out.println(name + " enjoys eating bones and meat.");
    }
}
