package VariableAndData;

import java.util.Scanner;

/**
 * Created by rajan on 12/9/17.
 */
public class ConditionalDemo {

     Scanner scanner;



    void conditionCheck()
    {
       scanner=new Scanner(System.in);
        System.out.println("enter the percentage of a :");
        int a=scanner.nextInt();
//        System.out.println("enter the value of b :");
//        int b=scanner.nextInt();
        if (a < 35)
        {
            if (a>30)
            {
                System.out.println("pass class");
            }

            System.out.println("fail");
        }
        else if (35<=a && a<60)
        {
            System.out.println("pass");
        }
        else if (60<=a && a<75)
        {
            System.out.println("first class");
        }

        else if (75<=a && a<=100)
        {
            System.out.println("distinction");
        }

        else
        {
            System.out.println("not in condition");
        }
    }
    public static void main(String[] args) {

        ConditionalDemo conditionalDemo=new ConditionalDemo();
        conditionalDemo.conditionCheck();


    }
}
