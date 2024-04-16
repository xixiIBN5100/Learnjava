import xsx.Animal;
import xsx.Bird;
import xsx.Dog;

// 测试类 TestAnimal
public class TestAnimal {
    public static void main(String[] args) {
        // 创建 Bird 对象
        Animal bird = new Bird("Sparrow", 2, 0.1);
        // 调用 Bird 对象的方法
        bird.showInfo();
        bird.move();
        bird.eat();

        System.out.println(); // 打印空行

        // 创建 Dog 对象
        Animal dog = new Dog("Labrador", 3, 25.0);
        // 调用 Dog 对象的方法
        dog.showInfo();
        dog.move();
        dog.eat();
    }
}

