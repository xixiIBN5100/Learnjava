package homework_02;
import java.util.Scanner;

public class PizzaMaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请选择制作披萨类型：");
            System.out.println("1. 培根披萨");
            System.out.println("2. 海鲜披萨");
            System.out.println("3. 退出");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 消耗换行符

            if (choice == 1) {
                System.out.println("请输入培根披萨的名称：");
                String name = scanner.nextLine();
                System.out.println("请输入培根披萨的价格：");
                double price = scanner.nextDouble();
                scanner.nextLine(); // 消耗换行符
                System.out.println("请输入培根披萨的大小：");
                String size = scanner.nextLine();
                System.out.println("请输入培根的克数：");
                int baconWeight = scanner.nextInt();
                scanner.nextLine(); // 消耗换行符

                BaconPizza baconPizza = new BaconPizza(name, price, size, baconWeight);
                System.out.println("制作的培根披萨信息如下：");
                baconPizza.displayPizzaInfo();
            } else if (choice == 2) {
                System.out.println("请输入海鲜披萨的名称：");
                String name = scanner.nextLine();
                System.out.println("请输入海鲜披萨的价格：");
                double price = scanner.nextDouble();
                scanner.nextLine(); // 消耗换行符
                System.out.println("请输入海鲜披萨的大小：");
                String size = scanner.nextLine();
                System.out.println("请输入海鲜披萨的配料信息：");
                String ingredients = scanner.nextLine();

                SeafoodPizza seafoodPizza = new SeafoodPizza(name, price, size, ingredients);
                System.out.println("制作的海鲜披萨信息如下：");
                seafoodPizza.displayPizzaInfo();
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("选择有误，请重新选择！");
            }
        }
        scanner.close();
    }
}

