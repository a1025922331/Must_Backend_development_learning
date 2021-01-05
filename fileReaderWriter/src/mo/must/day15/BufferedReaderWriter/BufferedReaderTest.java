package mo.must.day15.BufferedReaderWriter;

import java.io.*;

public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("fileReaderWriter\\BufferedReader.txt"));
        String sTemp;
        while((sTemp=br.readLine())!=null){
            System.out.println(sTemp);
        }
        br.close();
    }
}
