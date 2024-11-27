package Oopslec5;

public abstract class Parent {
    static int age;
    final int num;


    // we can create constructors in abstract classes also
    public Parent(int age) {
        this.age = age;
        this.num = 345;
    }
    static void welcome(){
        System.out.println("Hi and welcome Mr."+ age);
    }
    void normal(){
        System.out.println("I am normal");
    }

    abstract void career(String name);
    abstract void partner(String name);
}
