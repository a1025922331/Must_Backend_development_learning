package mo.must.day3.stringTest;

import java.util.Scanner;


public class CountCharInString {
    public static void main(StringBuilderTest[] args) {
        String s = new Scanner(System.in).nextLine();
        int capital = 0;
        int lowercase = 0;
        int figure = 0;
        int otherCharacter = 0;

        char[] cArray = s.toCharArray();

        for (int i = 0; i < cArray.length; i++) {
            if (cArray[i] >= 'A' && cArray[i] <= 'Z')
                capital++;
            else if (cArray[i] >= 'a' && cArray[i] <= 'z')
                lowercase++;
            else if (cArray[i] >= '0' && cArray[i] <= '9')
                figure++;
            else
                otherCharacter++;
        }

        System.out.println("capital: " + capital);
        System.out.println("lowercase: " + lowercase);
        System.out.println("figure: " + figure);
        System.out.println("otherCharacter: " + otherCharacter);
    }
}
