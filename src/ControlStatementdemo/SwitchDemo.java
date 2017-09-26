package ControlStatementdemo;

import java.util.Scanner;

import static javafx.application.Platform.exit;

/**
 * Created by rajan on 22/9/17.
 */
public class SwitchDemo {
    void display(){
        int a,b,c;
        System.out.println("1.Add");
        System.out.println("2.Sub");
        System.out.println("3.Mul");
        System.out.println("4.Div");
        System.out.println("5.Mod");
        System.out.println("Enter Your Choice:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a>5) {
            System.out.println("default case");

        }
        System.out.println("enter value of num1: ");
        b=sc.nextInt();
        System.out.println("enter value of num2: ");
        c=sc.nextInt();
        switch (a){
            case 1 :
                a= b+c;
                System.out.println("addition : " +a);
                break;
            case 2 :
                a= b-c;
                System.out.println("subtraction : " +a);
                break;
            case 3 :
                a=b*c;
                System.out.println("Multiplication : " +a);
                break;
            case 4 :
                a=b/c;
                System.out.println("Division : " +a);
                break;
            case 5 :
                a=b%c;
                System.out.println("Mod : " +a);
                break;
            default:
                System.out.println("invalid");
                break;

        }

    }


    public static void main(String[] args) {
        SwitchDemo sd=new SwitchDemo();
        sd.display();
    }
}
