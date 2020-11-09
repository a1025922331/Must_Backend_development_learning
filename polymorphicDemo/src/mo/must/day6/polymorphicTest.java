package mo.must.day6;

import com.sun.jdi.ClassType;

public class polymorphicTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        getAnimal(d);
        getAnimal(c);

        //测试向下转型
        Animal d2 = new Dog();
        Dog d3 = (Dog)d;
        System.out.println(d2.getClass());
        System.out.println(d3.getClass());
        System.out.println(d2.category);
        System.out.println(d3.category);
    }

    public static void getAnimal(Animal a){
        a.eat();
    }
}

interface Animal{
    String category = "animal";
    public abstract void eat();
}

class Dog implements Animal{
    String category = "dog";
    @Override
    public void eat() {
        System.out.println("dogs eat " + food());
    }

    //在多态中能成功运行，说明多态向上转型时，方法的实现中可以调用子类特有的方法
    private String food(){
        return "meats";
    }
}

class Cat implements Animal{
    String category = "cat";
    @Override
    public void eat() {
        System.out.println("cats eat " + food());
    }

    private String food(){
        return "fishes";
    }
}