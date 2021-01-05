package mo.must.day14.copyFile;

import java.io.*;

public class CopyBuffered {
    public static void main(String[] args) throws IOException {
        //buffer之间单字节传输
        copyMethod1("fileInOutputStream\\unifying250.exe","fileInOutputStream\\3.exe");
        //buffer之间字节数组传输
        copyMethod2("fileInOutputStream\\unifying250.exe","fileInOutputStream\\4.exe");
    }

    private static void copyMethod2(String from, String to) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(from));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(to));

        long startTime = System.currentTimeMillis();
        int temp;
        while((temp=bis.read())!=-1){
            bos.write(temp);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("时间为："+(endTime - startTime)+"ms");
        bis.close();
        bos.close();
    }

    private static void copyMethod1(String from, String to) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(from));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(to));

        long startTime = System.currentTimeMillis();
        byte[] temps = new byte[4];
        int len;
        while((len = bis.read(temps))!=-1){
            bos.write(temps,0,len);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("时间为："+(endTime - startTime)+"ms");
        bis.close();
        bos.close();
    }
}
