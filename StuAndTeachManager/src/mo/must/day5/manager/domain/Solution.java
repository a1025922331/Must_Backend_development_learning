package mo.must.day5.manager.domain;

//11/08 周赛

import jdk.swing.interop.SwingInterOpUtils;

class Solution {

    public static void main(String[] args) {
        int[] a = {1,4,3};
        sortPop(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public int maxProfit(int[] inventory, int orders) {
        int value = 0;
        do{
            sortPop(inventory);
            value+=(inventory[0]--);
            value%=(1000000000 + 7);
            orders--;
        }while(orders > 0);

        return value;
    }


    public static int sortPop(int[] arr){
        if(arr !=null&&arr.length !=0){
            for(int i=0;i<arr.length-1;i++){
                for(int j=0;j<arr.length-1-i;j++){
                    if(arr[j+1]>arr[j]){
                        int tmp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=tmp;
                    }
                }
            }
        }
        return 0;
    }
}