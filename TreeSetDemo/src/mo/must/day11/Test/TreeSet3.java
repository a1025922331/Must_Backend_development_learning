package mo.must.day11.Test;

import mo.must.day11.domain.Grade;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet3 {
    public static void main(String[] args) {
        TreeSet<Grade> treeSet = new TreeSet<>();
        Grade g1 = new Grade("a",90,90,90);
        Grade g2 = new Grade("b",90,90,90);
        Grade g3 = new Grade("c",90,95,90);
        Grade g4 = new Grade("a",90,95,100);

        treeSet.add(g1);
        treeSet.add(g2);
        treeSet.add(g3);
        treeSet.add(g4);

        for (Grade grade : treeSet) {
            System.out.println(grade);
        }
    }
}
