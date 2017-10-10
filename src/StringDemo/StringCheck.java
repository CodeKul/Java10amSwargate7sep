package StringDemo;

/**
 * Created by rajan on 7/10/17.
 */
public class StringCheck {

    public static void main(String[] args) {

        Long i=System.currentTimeMillis();
        System.out.println(i);
      //  StringBuilder s=new StringBuilder("sainath");
        String s="sainath";
//        s.concat("pawar");
//        String s1=s.concat("pawar");
        int q=s.length();
//        System.out.println(i);
//
        char[] array=s.toCharArray();

        for (int j=q-1;j>=0;j--)
        {
            System.out.print(array[j]);
        }
        System.out.println();
       // System.out.println(s.reverse());
        Long k=System.currentTimeMillis();
        int m= (int) (k-i);
        System.out.println(m);
    }

}
