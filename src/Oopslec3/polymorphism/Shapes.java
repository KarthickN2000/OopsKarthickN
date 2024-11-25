package Oopslec3.polymorphism;

public class Shapes {
    //Many ways of single definition
    //if we remove the below area fuction from the shapes then the overridden doesnot happen
    //we cant access circle.area() with reference as shapes
    void area(){
        System.out.println("I am in shapes");
    }
}
