package Abstraction;

/**
 * Created by rajan on 4/10/17.
 */


abstract class Mobile
{
    abstract void call();

    abstract void msg();

    void games()
    {
        System.out.println("playing games");
    }
}


public class AbstractClass extends Mobile

{
    @Override
    void call() {
        System.out.println("calling");
    }

    @Override
    void msg() {
        System.out.println("msg");
    }

    public static void main(String[] args) {

        Mobile mobile=new AbstractClass();
        mobile.call();
        mobile.msg();
        mobile.games();
    }


}



