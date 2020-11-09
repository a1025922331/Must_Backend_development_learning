package mo.must.day6.test1;
//Calculator接口：有calculate抽象方法
//test类中有useCalculator方法: 分别生成不大于参数的两个随机数，并打印加法表达式
//test类中的main方法调用useCalculator方法并使用Lambda表达式和匿名内部对象

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        useCalculator((int a, int b) -> {
            String s = String.valueOf(a) + " + " + String.valueOf(b) + " = " + String.valueOf(a + b);
            return s;
        });
    }

    public static void useCalculator(Calculator calculator) {
        Random rd = new Random();
        int a = rd.nextInt(10);
        int b = rd.nextInt(10);
        String s = calculator.addCalculateExpression(a, b);
        System.out.println(s);
    }
}

interface Calculator {
    String addCalculateExpression(int a, int b);
}
