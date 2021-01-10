package mo.must.day16;

import mo.must.day16.domain.User;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest {
    public static void main(String[] args) throws IOException {
        //定义类操作输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ObjectInputOutputStream\\User.txt"));

        //存入本地文件中
        User user1 = new User("guozexin","123456");
        User user2 = new User("guozejia","12345678");
        oos.writeObject(user1);
        oos.writeObject(user2);

        //结束操作
        oos.close();
    }
}
