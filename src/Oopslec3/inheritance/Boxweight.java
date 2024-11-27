package Oopslec3.inheritance;

public class Boxweight extends Box{
    double weight;

    static void greeting(){
        System.out.println("Hey i am in boxweight class.");
    }

    public Boxweight() {
        super();
        //suppose if the Box class contains a varibale known as weight
        // then it can be accessible by super.weight
        System.out.println();
        this.weight = 100;
    }
    // the below will call the Box constrctor of the object type constructor excatly
    // like Box box5 = new Boxweight(2,3,4,5)

    // super() actually meaning means Box() the superrior class then Box(Boxweight object)
    public Boxweight(Boxweight other) {
        super(other);
        this.weight = other.weight;
    }

    public Boxweight(double l, double h, double w, double weight) {
        /*this.l = l;
        this.h = h;
        this.w = w;*/
        //the above also applicable for parent class variables and
        super(l,h,w); //this also applicable
        this.weight = weight;
    }
}
