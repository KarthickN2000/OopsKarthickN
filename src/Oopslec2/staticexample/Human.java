package Oopslec2.staticexample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;//population is a static variable it is independent of object depends on the class


    static void message(){
//        System.out.println(this.name); ! gives error bcos static method is independent of object so it gives error.
    }
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
        
    }
}
