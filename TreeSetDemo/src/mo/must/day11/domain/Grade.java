package mo.must.day11.domain;

import java.util.Comparator;

public class Grade implements Comparable<Grade> {
    private String name;
    private int chinese;
    private int math;
    private int english;

    public Grade() {
        this("default", 0, 0, 0);
    }

    public Grade(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getSum() {
        return chinese + math + english;
    }


    @Override
    public String toString() {
        return "Grade{" +
                "name='" + name + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english + ", total =" + getSum() +
                '}';
    }

    @Override
    public int compareTo(Grade o) {
        int result;
        //相比总分，递减
        result = o.getSum() - this.getSum();
        //总分相同比语文，递减
        result = (result == 0) ? o.getChinese() - this.getChinese() : result;
        //语文相同比数学，递减
        result = (result == 0) ? o.getMath() - this.getMath() : result;
        //数学相同则英语肯定也相同，不用比了，直接比名字,递增
        result = (result == 0) ? this.getName().compareTo(o.getName()): result;
        return result;
    }
}
