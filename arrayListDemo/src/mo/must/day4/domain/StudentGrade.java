package mo.must.day4.domain;

public class StudentGrade {
    private String name;
    private int score;

    public StudentGrade() {
    }

    public StudentGrade(String name, int age) {
        this.name = name;
        this.score = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "studentGrade{" +
                "name='" + name + '\'' +
                ", age=" + score +
                '}';
    }
}
