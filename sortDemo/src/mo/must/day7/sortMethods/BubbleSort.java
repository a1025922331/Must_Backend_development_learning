package mo.must.day7.sortMethods;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {7,1,2,3,4,5,6};
        int[] b = {7,1,2,3,4,5,6};

        long start = System.currentTimeMillis();

        //not use flag variable
        a = method(a);
        long point1 = System.currentTimeMillis();

        //use flag variable
        b = methodUseFlag(b);
        long point2 = System.currentTimeMillis();

        printArray(a);
        System.out.println(point1 - start);
        printArray(b);
        System.out.println(point2 - point1);

    }

    public static int[] method(int[] array) {
        //from small to big
        int temp;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            printArray(array);
        }
        return array;
    }

    public static int[] methodUseFlag(int[] array) {
        //from small to big
        int temp;
        //Is there an exchange going on？
        boolean flag;

        for (int i = 0; i < array.length - 1; i++) {
            flag = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            printArray(array);
            if(flag==false){
                return array;
            }
        }
        return array;
    }

    private static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
