package mo.must.day15.Exercises;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SaveUsernameAndPassword {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("fileReaderWriter\\UserInfo.txt");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your username: ");
        String username = sc.nextLine();
        System.out.print("Please enter your password: ");
        String password = sc.nextLine();

        fw.write(username);
        fw.write("\r\n");
        fw.write(password);

        fw.close();
    }
}
