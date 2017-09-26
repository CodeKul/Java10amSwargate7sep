package loop;

/**
 * Created by rajan on 23/9/17.
 */
public class WhileLoop2 {

  static int i=0;


    public static void main(String[] args) {

        while (i < 10) {
            System.out.println("welcome : "+i);
            i++;
        }
        System.out.println("value of i : "+i);

        do {
            System.out.println("in do while : "+i);
            i++;
        } while (i < 10);
    }

    }

