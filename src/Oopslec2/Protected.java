package Oopslec2;

import Oopslec3.inheritance.Box;

public class Protected extends Box {

    Protected(double l,double h,double w){
        super(l,h,w);
    }

    public static void main(String[] args) {
        Box obj = new Protected(1,2,3);

//        System.out.println(obj.l); this provide error because l variable is protected in Box class
//        so it can be accessed only via subclass as reference variable in diff package
    }


}
