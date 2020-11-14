package mo.must.day8;

//若用try-catch成接住异常，则程序可以继续运行
//只要进入了对应的catch，执行完毕后就可以继续运行，哪怕catch局部代码块中为空

public class ExceptionTest1 {
    public static void main(String[] args) {
        int[] array1 = null;
        try {
            arrayPrint(array1);
        } catch (Exception e) {
            //从throwable中的继承的一个成员方法
            e.printStackTrace();
        }

        int[] array2 = {1, 2, 3, 4, 5};
        arrayPrint(array2);
    }

    private static void arrayPrint(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array == null) {
                throw new NullPointerException();
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }

}
