package RecursionDemo;

/**
 * Created by rajan on 10/10/17.
 */
public class RecursionPractice {

    static int count=0;
   static void getData()
    {

        if (count<=5)
        {
            System.out.println("codekul");
            count++;
            getData();
        }
    }

    public static void main(String[] args) {
       getData();
    }

}
