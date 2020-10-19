package mo.must.day4.test1;

import mo.must.day4.domain.StudentGrade;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBaseTest {
    public static void main(String[] args) {
        ArrayList<StudentGrade> sgTotal = getGradesOfStudentArrayList();
        ArrayList<StudentGrade> sgPass = selectStudentsWithPassGrade(sgTotal);
        System.out.println(sgTotal);
        printArrayList(sgTotal);
        System.out.println("成绩合格的同学如下：");
        System.out.println(sgPass);
        printArrayList(sgPass);

    }

    //键入学生信息创建StudentGrade对象并加入返回成绩集合的方法
    private static ArrayList<StudentGrade> getGradesOfStudentArrayList() {
        //初始化
        Scanner sc = new Scanner(System.in);
        String s = "";
        ArrayList<StudentGrade> sgTotal = new ArrayList<>();
        //循环输入，并创建对象，并加入集合
        while (true) {
            System.out.print("请输入学生成绩信息（以“姓名 分数”的格式）：");
            s = sc.nextLine(); //读取输入流
            if ("done".equals(s))
                break;
            String[] sSplit = s.split(" "); //切割
            //创建StudentGrade对象并加入集合
            sgTotal.add(new StudentGrade(sSplit[0], Integer.valueOf(sSplit[1])));
        }
        return sgTotal;
    }

    //筛选成绩及格的学生
    private static ArrayList<StudentGrade> selectStudentsWithPassGrade(ArrayList<StudentGrade> sgTotal) {
        ArrayList<StudentGrade> sgPass = new ArrayList<>();
        StudentGrade sgTemp = new StudentGrade();
        for (int i = 0; i < sgTotal.size(); i++) {
            sgTemp = sgTotal.get(i);
            if (sgTemp.getScore() >= 60) {
                sgPass.add(sgTemp);
            }
        }
        return sgPass;
    }

    //打印集合中学生成绩信息的方法
    public static void printArrayList(ArrayList<StudentGrade> sgList) {
        for (int i = 0; i < sgList.size(); i++) {
            System.out.println(sgList.get(i));
        }
    }
}
