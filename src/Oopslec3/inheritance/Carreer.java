package Oopslec3.inheritance;

public class Carreer {
    String name;
    int num;

    public Carreer(String name) {
        this.name = name;
        this.num = 4;
    }
    void greeting(String name){
        System.out.println(this.name + " "+name);
    }

    public static void main(String[] args) {
        Carreer obj1 = new Carreer("Karthick");

        obj1.greeting("Usha");
    }
}
