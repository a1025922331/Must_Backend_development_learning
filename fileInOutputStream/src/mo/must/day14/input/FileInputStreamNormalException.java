package mo.must.day14.input;

import com.sun.source.tree.CatchTree;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamNormalException {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("fileInOutputStream\\abc.txt");
            int c;
            while((c=fis.read())!=-1){
                System.out.print((char) c);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
