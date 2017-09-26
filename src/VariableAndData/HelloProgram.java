package VariableAndData;

/**
 * Created by rajan on 8/9/17.
 */

public class HelloProgram {

     int a=10;
     int b=20;
    int result;

    void add()
    {
        result=a+b;
     //   System.out.println(" welcome to Codekul");
        System.out.println("result = "+result);
        System.out.println("result of post "+result++);
        System.out.println("after post "+result);
        System.out.println("result of pre "+(++result));
    }

    void sub()
    {
        result=b-a;
       // int b=c;+
     //   System.out.println("hello java");
        System.out.println(result);
    }


    public static void main(String[] args) {

      HelloProgram object=new HelloProgram();
      object.add();
      object.sub();
      //  new HelloProgram().sub();

//      object.show();
//      object.get();


      //  System.out.println(" Welcome to Codekul");
    }






}
