package ScannerClass;

import java.util.Scanner;

/**
 * Created by rajan on 11/9/17.
 */
public class UserInput {

    Scanner scanner=new Scanner(System.in);

    void get()
    {

        System.out.println("enter the value of a :");
        int a=scanner.nextInt();
        System.out.println("enter the value of b :");
        int b=scanner.nextInt();

        int c=a+b;
        System.out.println("hgchgh"+c);

    }

    public static void main(String[] args) {

        new UserInput().get();

    }

}
