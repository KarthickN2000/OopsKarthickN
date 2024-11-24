package Oopslec3.inheritance;

public class Boxweight extends Box{
    double weight;

    public Boxweight() {
        super();
        //suppose if the Box class contains a varibale known as weight
        // then it can be accessible by super.weight
        System.out.println();
        this.weight = weight;
    }
    // the below will call the Box constrctor of the object type constructor excatly
    // like Box box5 = new Boxweight(2,3,4,5)

    // super() actually meaning means Box() the superrior class then Box(Boxweight object)
    public Boxweight(Boxweight other) {
        super(other);
        this.weight = other.weight;
    }

    public Boxweight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }
}
