package com.hiwijaya.pattern.singleton;

/*
* Singleton
*
* This pattern involves a single class which is responsible to create an object
* while making sure that ONLY single object gets created.
* This class provides a way to access its only object which can be accessed directly
* without need to instantiate the object of the class.
*
* */
public class Singleton {

    // singleton object
    private static Singleton singleObject;

    public String info;


    // private to make sure this class can't instantiate
    private Singleton(){
        info = "default message";
    }

    // get singleton instance
    public static Singleton getInstance(){
        if(singleObject == null){
            singleObject = new Singleton();
        }
        return singleObject;
    }

}

class Main {

    public static void main(String[] args) {
        Singleton object1 = Singleton.getInstance();
        System.out.println(object1.info);
        object1.info = "Info has changed by object1";

        Singleton object2 = Singleton.getInstance();
        System.out.println(object2.info);
    }
}
