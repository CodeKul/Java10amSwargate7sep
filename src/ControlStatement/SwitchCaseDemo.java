package ControlStatement;

import java.util.Scanner;

/**
 * Created by rajan on 14/9/17.
 */
public class SwitchCaseDemo {

    int a,b,result,caseNumber;
    String abc;
    static Scanner s;
    String check;
    void show()
    {

        s=new Scanner(System.in);

        System.out.println("Enter the value of a");

        a=s.nextInt();

        System.out.println("Enter the value of b");

        b=s.nextInt();

        System.out.println("1. add\n"+"2. sub\n"+"3. mul\n"+"4. div");

        System.out.println("Enter your choice");

        caseNumber=s.nextInt();



        switch (caseNumber) {
            case 1:

                      result=a+b;
                      System.out.println(result);
                      if (result%2==0)
                      {
                          System.out.println("even number");
                      }
                      else {
                          System.out.println("odd number");
                      }
                System.out.println("want to continue again");

                check=s.nextLine();
                if (check.equals("yes"))
                {
                    show();
                }
                break;

            case 2:

                result=a-b;
                System.out.println(result);
                if (result%2==0)
                {
                    System.out.println("even number");
                }
                else {
                    System.out.println("odd number");
                }
                System.out.println("want to continue again");

                check=s.nextLine();
                if (check.equals("yes"))
                {
                    show();
                }
                break;

            case 3:

                result=a*b;
                System.out.println(result);
                if (result%2==0)
                {
                    System.out.println("even number");
                }
                else {
                    System.out.println("odd number");
                }
                System.out.println("want to continue again");
                check=s.nextLine();
                if (check.equals("yes"))
                {
                    show();
                }
                break;

            case 4:

                result=a/b;
                System.out.println(result);
                if (result%2==0)
                {
                    System.out.println("even number");
                }
                else {
                    System.out.println("odd number");
                }
                System.out.println("want to continue again");
                check=s.nextLine();
                if (check.equals("yes"))
                {
                    show();
                }
                break;

            default:

                System.out.println("not in switch cases");


        }

    }


    public static void main(String[] args) {
        SwitchCaseDemo switchCaseDemo=new SwitchCaseDemo();


        switchCaseDemo.show();


    }

}
