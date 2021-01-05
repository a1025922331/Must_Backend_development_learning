package mo.must.day15.BufferedReaderWriter;

import java.io.*;

public class BufferedFunction {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("fileReaderWriter\\BufferedReader.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("fileReaderWriter\\BufferedWriter.txt",true));

        char[] cArray = new char[5];
        int len;
        while((len = br.read(cArray))!=-1){
            bw.write(cArray,0,len);
        }

        br.close();
        bw.close();
    }
}
