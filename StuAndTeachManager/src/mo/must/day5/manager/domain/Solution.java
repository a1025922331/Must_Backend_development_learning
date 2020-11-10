package mo.must.day5.manager.domain;

//11/08 周赛

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;


class Solution {
    static Long start = System.currentTimeMillis();

    public static void main(String[] args) {
        int[] array = {497978859,167261111,483575207,591815159};
//        int[] array = {3,5};

        System.out.println(maxProfit(array, 836556809));
        System.out.println("总用时：");
        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    public static long maxProfit(int[] inventory, int orders) {
        long value = 0L;

        if(inventory.length==1){
            long a = inventory[0];
            value = (a + (a-orders+1))*orders/2;
            value %= (1000000007);
            return value;
        }

//        if(inventory.length==1){
//            int a = inventory[0];
//            for (int i = 0; i < orders; i++) {
//                value += a;
//                if (value > 1000000007) {
//                    value %= 1000000007;
//                }
//                a--;
//            }
//            return value;
//        }

        int[][] frequent = new int[100001][2];

        for (int i = 0; i < inventory.length; i++) {
            for (int j = 0; j < frequent.length; j++) {
                if (frequent[j][0] == 0) {
                    frequent[j][0] = inventory[i];
                    frequent[j][1]++;
                    break;
                } else if (frequent[j][0] == inventory[i]) {
                    frequent[j][1]++;
                    break;
                }
            }
        }

        bubbleSort1(frequent);
        System.out.println("排序用时：");
        System.out.println(System.currentTimeMillis() - start + "ms");

//        for (int i = 0; i < 10; i++) {
//            System.out.println(frequent[i][0] + " " + frequent[i][1]);
//        }

        for (int i = 0; orders > 0; i++) {
            int num = frequent[i][0];
            int category = frequent[i][1];
            if (category <= orders) {
                value += (category * num);
                if (value >= 1000000000) {
                    value %= (1000000000 + 7);
                }
                orders -= category;
                if (frequent[i + 1][0] == num - 1) {
                    frequent[i + 1][1] += category;
                } else {
                    frequent[i][0] -= 1;
                    i--;
                }
            }
            else if(category > orders){
                value += (orders * num);
                if (value >= 1000000000) {
                    value %= (1000000000 + 7);
                }
                orders = 0;
            }
        }
        return value;
    }

    public static void bubbleSort1(int a[][]) {
        int n = a.length;
        boolean exchange;
        for (int i = 0; i < n - 1; i++) {
            exchange = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j][0] < a[j + 1][0]) {
                    exchange = true;
                    int tmp[] = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
            if (!exchange) break;
        }
    }
}