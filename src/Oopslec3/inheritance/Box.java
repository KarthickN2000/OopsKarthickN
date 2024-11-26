package Oopslec3.inheritance;

public class Box {
    protected double l;
    public double h;
    public double w;

    static void greeting(){
        System.out.println("Hey i am in box class!");
    }

    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;

    }
    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(double side) {
        this.l = side;
        this.h = side;
        this.w = side;

    }
    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
}
