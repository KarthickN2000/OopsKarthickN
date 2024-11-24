package Oopslec3.polymorphism;

public class Methodoverloading {
    //The below method overloading functions are all examples of Compile time or Static Polymorphism
    //Because when during compiling only which funtion to execute can be decided actually.
    int sum(int a,int b){
        return a + b;
    }static int sum(int a,int b,int c){
        return a + b + c;
    }static int sum(int a,int b,int c,int d){
        return a + b + c + d;
    }

    public static void main(String[] args) {
        Methodoverloading obj1 = new Methodoverloading();

        System.out.println(obj1.sum(1,2));
    }

}
