package Abstraction;

/**
 * Created by rajan on 4/10/17.
 */
public interface InterfaceDemo {

    void call();
    void msg();
    void games();

}
 interface SecondInterface
{
    void call();
    void msg();
}

class MobileDemo implements SecondInterface,InterfaceDemo
{


    public void call() {
        System.out.println("calling");
    }


    public void msg() {
        System.out.println("msg");
    }


    public void games() {
        System.out.println("playing games");
    }

    public static void main(String[] args) {
        InterfaceDemo interfaceDemo=new MobileDemo();
        SecondInterface secondInterface=new MobileDemo();
        interfaceDemo.call();
        secondInterface.call();

        interfaceDemo.msg();
        interfaceDemo.games();
    }
}
