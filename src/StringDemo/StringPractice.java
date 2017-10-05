package StringDemo;

/**
 * Created by rajan on 5/10/17.
 */
public class StringPractice {

    public static void main(String[] args) {

        String s="vasu";
        String s1="vasu";
        String s2=new String("vasu");

        if (s2.equals(s1))
        {
            System.out.println("same values");
        }
        else
        {
            System.out.println("different values");
        }

    }


}
