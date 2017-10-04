package inheritance;

/**
 * Created by rajan on 26/9/17.
 */

class Parent
{
    int i=10;
    void show()
    {
        System.out.println(i);
    }
}

public class InheritanceDemo extends Parent {

    public static void main(String[] args) {
        InheritanceDemo inheritanceDemo=new InheritanceDemo();
        inheritanceDemo.show();
    }

}
