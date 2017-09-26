package ControlStatementdemo;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by rajan on 22/9/17.
 */
public class IfElseDemo {
    public static void main(String[] args) {
        int a=0;
        System.out.println("Enter Number :");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a%2==0)
        {
            System.out.println("Even Number");
        }else
        {
            System.out.println("Odd Number");
        }
    }
}
