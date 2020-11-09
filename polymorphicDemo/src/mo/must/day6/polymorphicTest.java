package mo.must.day6;

public class polymorphicTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        getAnimal(d);
        getAnimal(c);

    }

    public static void getAnimal(Animal a){
        a.eat();
    }
}

interface Animal{
    public abstract void eat();
}

class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("dogs eat meats");
    }
}

class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("cats eat fishes");
    }
}