package inheritance;

/**
 * Created by rajan on 26/9/17.
 */

class Animal
{
    void show()
    {
        System.out.println("in animal class");
    }
}
class dog extends Animal
{
    void display()
    {
        System.out.println("in dog class");
    }
}
class cat extends dog
{
    public static void main(String[] args) {
        cat c=new cat();
        c.display();
    }

}


public class multiLevel {
}
