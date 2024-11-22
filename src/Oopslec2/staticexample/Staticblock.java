package Oopslec2.staticexample;

public class Staticblock {
    static int a = 4;
    static int b;

    //static block runs only one time when the first object is created
    static{
        b = a * 4;
    }

    public static void main(String[] args) {
        Staticblock obj1 = new Staticblock();
        System.out.println(Staticblock.a +" "+Staticblock.b);


        Staticblock obj2 = new Staticblock();
        System.out.println(Staticblock.a +" "+Staticblock.b);

    }
}
