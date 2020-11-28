package mo.must.day12;

public class variableParameterTest {
    public static void main(String[] args) {
        sum(1,2,3,4,5);
    }

    public static int sum(int... array) {
        int sum = 0;
        for (int i : array) {
            sum +=i;
        }
        return sum;

    }
}
