package Oopslec5;

public class Son extends Parent{
    public Son(int age) {
        super(age);
    }
    // the below is override method
    @Override
    void normal() {
        System.out.println("I am son");
    }

    @Override
    void career(String name){

    }
    @Override
    void partner(String name){

    }

    public static void main(String[] args) {
        Son son = new Son(24);
        son.welcome();
        son.normal();
        Parent obj2 = new Son(23);

        obj2.normal();
    }

}
