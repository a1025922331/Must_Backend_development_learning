package mo.must.day6;

public class Cat extends Animal {
    public Cat(){
        category = "Cat";
    }
    @Override
    public void eat() {
        System.out.println(category + " eat fish.");
    }
}

class Test{
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
    }
}
