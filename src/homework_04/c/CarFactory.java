package homework_04.c;

// 定义 CarFactory 类
class CarFactory {
    // 静态方法：根据车型名称返回对应的汽车对象
    public static Car getCar(String name) {
        if (name.equalsIgnoreCase("BMW")) {
            return new BMW();
        } else if (name.equalsIgnoreCase("Benz")) {
            return new Benz();
        } else {
            return null; // 如果未匹配到对应车型，返回 null 或抛出异常
        }
    }

    // 重载方法：直接接受 Car 对象作为参数
    public static Car getCar(Car car) {
        return car; // 直接返回传入的 Car 对象
    }
}

