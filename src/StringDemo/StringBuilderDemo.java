package StringDemo;

/**
 * Created by rajan on 9/10/17.
 */
public class StringBuilderDemo {

    static void usingString()
    {
        String s="codekul";
        for (int i=0;i<=20000;i++)
        {
            s.concat("institute");
        }
    }

    static void usingStingBuilder()
    {
        StringBuilder s=new StringBuilder("codekul");
        for (int i=0;i<=20000;i++)
        {
            s.append("institute");
        }
    }


    public static void main(String[] args) {

        Long t1=System.currentTimeMillis();
        StringBuilderDemo.usingString();
        System.out.println("Time for String = "+(System.currentTimeMillis()-t1)+"ms");

        Long t2=System.currentTimeMillis();
        StringBuilderDemo.usingStingBuilder();
        System.out.println("Time for StringBuilder = "+(System.currentTimeMillis()-t2+"ms"));

    }


}
