package loop;

import java.util.Scanner;

/**
 * Created by rajan on 23/9/17.
 */
public class ArrayDemo1 {

    void arrayDemo()
    {
        Scanner scanner=new Scanner(System.in);
        int k,l;
        System.out.println("enter array size5");
        k=scanner.nextInt();
        //int array[]={1,2,3,4};
        int array[] = new int[k];

      //  int size=array.length;
        for (int j=0;j<5;j++)
        {
            System.out.println("enter array : "+j);
            array[j]=scanner.nextInt();

        }
     //   System.out.println("array size ="+size);
        for (int i=0;i<array.length;i++)
        {
            System.out.println("array value : "+array[i]);
        }
    }

    public static void main(String[] args) {
        ArrayDemo1 arrayDemo1=new ArrayDemo1();
        arrayDemo1.arrayDemo();
    }
}
