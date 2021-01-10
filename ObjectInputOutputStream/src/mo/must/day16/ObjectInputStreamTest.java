package mo.must.day16;

import mo.must.day16.domain.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建对象输入操作流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ObjectInputOutputStream\\User.txt"));

        //读取
        User user1 = (User)ois.readObject();
        User user2 = (User)ois.readObject();

        //显示
        System.out.println(user1);
        System.out.println(user2);

        //结束操作
        ois.close();
    }
}
