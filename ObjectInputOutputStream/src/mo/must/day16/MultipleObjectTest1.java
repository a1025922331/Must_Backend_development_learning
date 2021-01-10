package mo.must.day16;


import mo.must.day16.domain.User;

import java.io.*;

//方法1：直接操作多个对象，catch住EOFException异常
public class MultipleObjectTest1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //序列化对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ObjectInputOutputStream\\Users.txt"));
        oos.writeObject(new User("张三", "123"));
        oos.writeObject(new User("李四", "456"));
        oos.writeObject(new User("王五", "789"));
        oos.close();

        //反序列化对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ObjectInputOutputStream\\Users.txt"));
        while (true) {
            User user = null;
            try {
                user = (User) ois.readObject();
            } catch (EOFException e) {
                break;
            }
            System.out.println(user);
        }
        ois.close();

    }
}
