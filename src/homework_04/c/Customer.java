package homework_04.c;
// 定义 Customer 类进行测试
public class Customer {
    public static void main(String[] args) {
        // 根据用户需要提取不同的汽车
        Car car1 = CarFactory.getCar("BMW");
        Car car2 = CarFactory.getCar("Benz");

        // 使用静态方法直接接受 Car 对象
        Car car3 = new BMW(); // 创建一个 BMW 对象
        Car car4 = CarFactory.getCar(car3); // 通过 CarFactory 获取同样的 BMW 对象

        // 输出汽车信息
        System.out.println(car1.getInfo()); // 输出 "BMW Car"
        System.out.println(car2.getInfo()); // 输出 "Benz Car"
        System.out.println(car4.getInfo()); // 输出 "BMW Car"
    }
}

