package mo.must.day12;

public class variableParameterTest2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(array);
        method1(array);
        method2(array);

    }

    public static void method1(int[] array){
        System.out.println(array);
    }

    public static void method2(int... array){
        System.out.println(array);
    }
}
