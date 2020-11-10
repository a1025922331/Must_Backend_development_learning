package mo.must.day7;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("0.2");
        BigDecimal bd2 = new BigDecimal("0.4");
        BigDecimal bd3 = new BigDecimal("0.7");

        //加
        System.out.println(0.2 + 0.4);
        System.out.println(bd1.add(bd2));

        //减
        System.out.println(0.2 - 0.4);
        System.out.println(bd1.subtract(bd2));

        //乘
        System.out.println(0.2 * 0.4);
        System.out.println(bd1.multiply(bd2));

        //除
        System.out.println(0.2 / 0.4);
        System.out.println(bd1.divide(bd2));

        //除（除不尽的情况）
        System.out.println(0.2 / 0.7);
        System.out.println(bd1.divide(bd3,100,BigDecimal.ROUND_CEILING));
    }
}
