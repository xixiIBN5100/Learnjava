package homework_02;

import java.text.DecimalFormat;

public class Account {
    private String id;
    private String owner;
    private double balance;

    // 无参构造方法
    public Account() {
        this.id = null;
        this.owner = null;
        this.balance = 0.00;
    }

    // 带参构造方法
    public Account(String id, String owner, double amount) {
        this.id = id;
        this.owner = owner;
        this.balance = amount;
    }

    // 设置账户id
    public void setID(String id) {
        this.id = id;
    }

    // 设置账户持有人姓名
    public void setOwner(String owner) {
        this.owner = owner;
    }

    // 存款
    public void deposit(String id, double amount) {
        if (this.id == null || !this.id.equals(id)) {
            System.out.println("帐号未知！");
        } else {
            this.balance += amount;
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println("成功存款" + df.format(amount) + "元，当前余额为" + df.format(this.balance) + "元！");
        }
    }

    // 取款
    public void withdraw(String id, double amount) {
        if (this.id == null || !this.id.equals(id)) {
            System.out.println("帐号未知！");
        } else if (this.balance < amount) {
            System.out.println("余额不足！");
        } else {
            this.balance -= amount;
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println("成功取款" + df.format(amount) + "元，当前余额为" + df.format(this.balance) + "元！");
        }
    }

    // 查询余额
    public void queryBalance() {
        System.out.println("帐号：" + this.id);
        System.out.println("持有人：" + this.owner);
        System.out.println("当前余额：" + this.balance);
    }

    public static void main(String[] args) {
        Account account = new Account();
        account.setID("1234567890");
        account.setOwner("John Doe");

        // 随机存款和取款
        double depositAmount = Math.random() * 1000; // 产生[0.0, 1000.0)内的随机数作为存款金额
        double withdrawAmount = Math.random() * 500; // 产生[0.0, 500.0)内的随机数作为取款金额

        account.deposit("1234567890", depositAmount);
        account.withdraw("1234567890", withdrawAmount);

        // 查询余额
        account.queryBalance();
    }
}
