package mo.must.day14.copyFile;

import mo.must.day14.input.FileInputStreamNormalException;

import java.io.*;

public class CopyTest1 {
    public static void main(String[] args) throws IOException {
//        //按字符读取
//        FileInputStream fis1 = new FileInputStream("fileInOutputStream\\unifying250.exe");
//        FileOutputStream fos1 = new FileOutputStream("fileInOutputStream\\1.exe");
//
//        long startTime1 = System.currentTimeMillis();
//        int temp;
//        while ((temp = fis1.read()) != -1) {
//            fos1.write(temp);
//        }
//        long pointTime1 = System.currentTimeMillis();
//        fis1.close();
//        fos1.close();
//        System.out.println("时间："+ (pointTime1 - startTime1) +"ms");

        //按字符数组读取
        FileInputStream fis2 = new FileInputStream("fileInOutputStream\\unifying250.exe");
        FileOutputStream fos2 = new FileOutputStream("fileInOutputStream\\2.exe");

        long startTime2 = System.currentTimeMillis();
        byte[] tempArray = new byte[1024];
        int len;
        while((len=fis2.read(tempArray))!=-1){
            fos2.write(tempArray,0,len);
        }
        long pointTime2 = System.currentTimeMillis();
        fis2.close();
        fos2.close();
        System.out.println("时间："+ (pointTime2 - startTime2) +"ms");
    }
}
