package Oopslec2.staticexample.Singleton;

public class Singleton {

    private Singleton() {

    }
    // if we use the constructor it again and again creating the object so
//    we declare a single instance variable and a class fucntion and access a single object throgh that variable

    //below is the object single instance variable

    public static Singleton instance;


    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
