package Oopslec3.inheritance;

public class Boxprice extends Boxweight{
    double price;


    Boxprice(){
        super();// it will call the empty constructor of boxweight class;
        this.price = 1;
    }
    public Boxprice(double l, double h, double w, double weight,double price) {
        super(l, h, w, weight);
        this.price = price;
    }
    Boxprice(Boxprice other){
        super(other);
        this.price = other.price;
    }
}
