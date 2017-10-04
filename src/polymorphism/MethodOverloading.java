package polymorphism;

/**
 * Created by rajan on 28/9/17.
 */
public class MethodOverloading {

    void show()
    {
        System.out.println("in default method");
    }
    void show(int i)
    {
        System.out.println("in parameterised method : "+i);
    }
    void show(int i,String name)
    {
        System.out.println("i : "+i+"\t"+"name : "+name);
    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading=new MethodOverloading();
        methodOverloading.show(1,"codekul");
        methodOverloading.show(2);
        methodOverloading.show();
    }
}
