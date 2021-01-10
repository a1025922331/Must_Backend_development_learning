package mo.must.day16;

import mo.must.day16.domain.User;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class MultipleObjectTest2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //序列化对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ObjectInputOutputStream\\Users.txt"));
        ArrayList<User> userList1 = new ArrayList<>();
        userList1.add(new User("guozexin", "123"));
        userList1.add(new User("guozejia", "456"));
        userList1.add(new User("guozeling", "789"));
        oos.writeObject(userList1);

        //反序列化对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ObjectInputOutputStream\\Users.txt"));
        ArrayList<User> userList2 = (ArrayList<User>) ois.readObject();
//        System.out.println(userList2);
        Iterator it = userList2.iterator();
        while (it.hasNext() == true) {
            System.out.println(it.next());
        }
    }
}
