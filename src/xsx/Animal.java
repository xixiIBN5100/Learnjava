package xsx;

public abstract class Animal {
    protected String name;
    protected int age;
    protected double weight;


    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }


    public abstract void move();

    public abstract void eat();


    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Weight: " + weight + " kg");
    }
}
