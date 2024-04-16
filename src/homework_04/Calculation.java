package homework_04;

import java.util.Random;

// 计算类 Calculation 继承 Operation
class Calculation extends Operation {

    // 构造方法，初始化操作数和运算符
    public Calculation(int operand1, int operand2, char operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    // 实现抽象方法：根据运算符进行加、减、乘、除运算
    public int operation() {
        int result = 0;
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2; // 简化为整数除法
                break;
            default:
                System.out.println("Invalid operator");
        }
        return result;
    }

    // 实现抽象方法：打印完整的运算题目和运算结果
    public void printOperation() {
        System.out.printf("%d %c %d = %d%n", operand1, operator, operand2, operation());
    }
}

