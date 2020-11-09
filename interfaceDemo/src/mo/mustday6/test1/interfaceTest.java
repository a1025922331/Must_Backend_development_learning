package mo.mustday6.test1;

public class interfaceTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        Dog dog = new Dog();
        dog.eat();
    }
}


class Cat implements Animal{

    @Override
    public void eat() {
        System.out.println("cat eat fishes");
    }
}

class Dog implements Animal{

    @Override
    public void eat() {
        System.out.println("dog eat meats");
    }
}

interface Animal{
    public void eat();

}