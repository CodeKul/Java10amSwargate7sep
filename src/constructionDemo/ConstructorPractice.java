package constructionDemo;

/**
 * Created by rajan on 21/9/17.
 */
public class ConstructorPractice
{
   static int a,b,c;
    ConstructorPractice(int a,int b)

    {

        this.a=a;
        this.b=b;
        int c=a+b;
        System.out.println("addition of a and b is "+c);
    }
//   static void addition()
//    {
//        c=a+b;
//        System.out.println("static method");
//
//    }

    public static void main(String[] args) {
        ConstructorPractice c=new ConstructorPractice(10,20);
       // constructorPractice.addition();
//        ConstructorPractice.addition();
    }
}
