package homework_04;

// 定义抽象类 Operation
abstract class Operation {
    protected int operand1;
    protected int operand2;
    protected char operator;

    // 抽象方法：返回运算结果
    public abstract int operation();

    // 抽象方法：打印完整的运算题目和运算结果
    public abstract void printOperation();
}

