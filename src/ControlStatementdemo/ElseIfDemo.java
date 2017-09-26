package ControlStatementdemo;

import java.util.Scanner;

/**
 * Created by rajan on 22/9/17.
 */
public class ElseIfDemo {
    void Show()
    {
        System.out.println("enter your percentage:");
        Scanner s= new Scanner(System.in);
    int a=s.nextInt();

        if(a<35)
        {
            System.out.println("You are fail");
        }
        else if(a>=35 && a<60)
        {
            System.out.println("You are pass");
        }
        else if(a>=60 && a<75)
        {
            System.out.println("You are in first class");
        }
        else if(a>=75 && a<=100)
        {
            System.out.println("You are in Distinction");
        }
        else
        {
            System.out.println("invalid");
        }

    }
    public static void main(String[] args) {
        ElseIfDemo e=new ElseIfDemo();
        e.Show();

    }
}
