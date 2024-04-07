package homework_02;

public class Car {
    private String brand;
    private double engineDisplacement;
    private double speed;
    private boolean status;
    private double maxSpeed;

    // 构造方法
    public Car(String brand, double engineDisplacement, double maxSpeed) {
        this.brand = brand;
        this.engineDisplacement = engineDisplacement;
        this.speed = 0;
        this.status = false;
        this.maxSpeed = maxSpeed;
    }

    // 启动方法
    public void start() {
        this.status = true;
        System.out.println("汽车已启动，状态为：" + this.status + "，当前速度为：" + this.speed);
    }

    // 加速方法
    public void speedUp() {
        if (this.status) {
            this.speed += 5;
            if (this.speed > this.maxSpeed) {
                this.speed = this.maxSpeed;
            }
            System.out.println("汽车加速，当前速度为：" + this.speed);
        } else {
            System.out.println("汽车未启动，无法加速！");
        }
    }

    // 减速方法
    public void slowDown() {
        if (this.status) {
            this.speed -= 5;
            if (this.speed < 0) {
                this.speed = 0;
            }
            System.out.println("汽车减速，当前速度为：" + this.speed);
        } else {
            System.out.println("汽车未启动，无法减速！");
        }
    }

    // 熄火方法
    public void stop() {
        if (this.speed == 0) {
            this.status = false;
            System.out.println("汽车已熄火，状态为：" + this.status);
        } else {
            System.out.println("汽车尚未停止，无法熄火！");
        }
    }

    public static void main(String[] args) {
        Car car = new Car("Ciallo～(∠・ω< )⌒☆", 2.0, 200);
        car.start();
        car.speedUp();
        car.speedUp();
        car.slowDown();
        car.stop();
    }
}

