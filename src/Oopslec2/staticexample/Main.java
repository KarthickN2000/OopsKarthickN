package Oopslec2.staticexample;

public class Main {
    public static void main(String[] args) {
        //Human is in same package so no need to import actually
        Human kunal = new Human(24,"Kunal",50000,true);
        Human rahul = new Human(23,"rahul",50000,true);
        Human arpit = new Human(25,"arpit",50000,true);
        System.out.println(kunal.population);
        System.out.println(Human.population);// 3 is the output
        Human.population = 40000;
        System.out.println(kunal.population);

        //instance means object bcos object is the instance of the class actually.
        //greeting();

        Main funn = new Main();
        funn.greeting();
        fun();
    }
    //fun is independent of instances
    static void fun(){
        //greeting();//greeting is dependent of instances gives error

        //we cant use non static stuff without object
        Main obj = new Main();
        obj.greeting();
    }

.   void fun2(){
        greeting();
    }
    void greeting(){

    }

}
