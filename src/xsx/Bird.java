package xsx;

public class Bird extends Animal {

    // 构造方法
    public Bird(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void move() {
        System.out.println(name + " flies in the sky.");
    }

    @Override
    public void eat() {
        System.out.println(name + " likes to eat seeds and insects.");
    }
}
