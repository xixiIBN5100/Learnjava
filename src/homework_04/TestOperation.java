package homework_04;

import java.util.Random;

// 测试类 TestOperation
public class TestOperation {
    public static void main(String[] args) {
        Random random = new Random();

        // 随机创建10个加、减、乘、除的计算对象并输出题目和运算结果
        for (int i = 0; i < 10; i++) {
            int operand1 = random.nextInt(100) + 1; // 生成1到100之间的随机整数
            int operand2 = random.nextInt(100) + 1; // 生成1到100之间的随机整数

            char operator;
            int operatorCode = random.nextInt(4); // 生成0到3之间的随机整数，用于选择运算符
            switch (operatorCode) {
                case 0:
                    operator = '+';
                    break;
                case 1:
                    operator = '-';
                    break;
                case 2:
                    operator = '*';
                    break;
                case 3:
                    operator = '/';
                    break;
                default:
                    operator = '+'; // 默认为加法
            }

            // 创建 Calculation 对象，并调用 printOperation() 方法输出题目和运算结果
            Operation calculation = new Calculation(operand1, operand2, operator);
            calculation.printOperation();
        }
    }
}

