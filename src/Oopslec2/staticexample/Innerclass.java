package Oopslec2.staticexample;

public class Innerclass {
    //outsideclass cant be static bcos there are no

    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }
    /*static void greeting(){
        System.out.println("Karthick");
    }*/
    public static void main(String[] args) {
//        Innerclass obj1 = new Innerclass();
        Test a = new Test("Karthick");
        Test b = new Test("Usha");

        System.out.println(a);
//        System.out.println(b.name);
//        greeting();
    }
}
