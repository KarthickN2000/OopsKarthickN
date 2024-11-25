package Oopslec3.inheritance;

import static Oopslec3.inheritance.Box.greeting;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box();
//
////        System.out.println(box.l +" "+box.h +" "+box.w);
//
//        Boxweight box3 = new Boxweight();
//        System.out.println(box3.h);


        // the below is example that parent is refering his child
        // but the child not refering the parent that is not
//            the left side reference type decide which avriables are accessible actually.
        Box box5 = new Boxweight();
        //System.out.println(box5.w);
        //Parent child is allowed but child parent not allowed bcos Box doesnt know how to construct weight variable
        // throws error reference can be parent

//        Boxweight box6 = new Box(9,8,7);

//        Boxprice box4 = new Boxprice(1,1,1,1,1);
//        System.out.println(box4.h);
        //greeting();//can be used with classname or without class name. like Box.greeting();

        //we cant override the static method important to note
        Boxweight box6 = new Boxweight();
        Boxweight.greeting();

    }
}
