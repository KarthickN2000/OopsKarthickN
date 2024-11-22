package Oopslec2.staticexample;

public class Main {
    public static void main(String[] args) {
        //Human is in same package so no need to import actually
        Human kunal = new Human(24,"Kunal",50000,true);
        Human rahul = new Human(23,"rahul",50000,true);
        Human arpit = new Human(25,"arpit",50000,true);
        System.out.println(kunal.population);
        System.out.println(Human.population);// 3 is the output

    }
}
