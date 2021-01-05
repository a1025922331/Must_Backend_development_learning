package mo.must.day15.Exercises;

import java.io.*;
import java.util.Arrays;

public class numberSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("fileReaderWriter\\number.txt")));
        FileWriter fw = new FileWriter("fileReaderWriter\\numberSorted.txt");

        String numString = br.readLine();
        String[] numSArray = numString.split(",");
        int[] numArray = new int[numSArray.length];
        for (int i = 0; i < numSArray.length; i++) {
            numArray[i] = Integer.parseInt(numSArray[i]);
        }
        Arrays.sort(numArray);
        for (int i : numArray) {
            fw.write(i+",");
        }
        br.close();
        fw.close();

    }
}
