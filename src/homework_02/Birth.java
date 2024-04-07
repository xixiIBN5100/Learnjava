package homework_02;

import java.util.Calendar;

public class Birth {
    private int year;
    private int month;
    private int day;

    // 无参构造方法
    public Birth() {
        this.year = 2000;
        this.month = 1;
        this.day = 1;
    }

    // 带参构造方法
    public Birth(int year, int month, int day) {
        // 简单控制年份、月份和日期的范围
        if (year < 0 || month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("输入不合法,初始化未默认数据");
            this.year = 2000;
            this.month = 1;
            this.day = 1;
        } else {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }

    // 成员方法 toString
    public String toString() {
        return "出生年月日：" + year + "年" + month + "月" + day + "日";
    }

    // 获取年龄方法
    public int getAge() {
        Calendar now = Calendar.getInstance();
        int currentYear = now.get(Calendar.YEAR);
        int age = currentYear - year;
        if (now.get(Calendar.MONTH) < month || (now.get(Calendar.MONTH) == month && now.get(Calendar.DAY_OF_MONTH) < day)) {
            age--;
        }
        return age;
    }

    public static void main(String[] args) {
        Birth birth1 = new Birth();
        System.out.println(birth1.toString());
        System.out.println("年龄：" + birth1.getAge());

        Birth birth2 = new Birth(1995, 8, 15);
        System.out.println(birth2.toString());
        System.out.println("年龄：" + birth2.getAge());
    }
}

