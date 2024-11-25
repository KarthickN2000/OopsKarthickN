package Oopslec3.polymorphism;

public class Objectprint {
    int num;

    public Objectprint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Objectprint{" +
                "num=" +this.num +
                '}';
    }

    public static void main(String[] args) {
        Objectprint obj = new Objectprint(4);
        System.out.println(obj);  // it uses toString method from object class
    }
}
