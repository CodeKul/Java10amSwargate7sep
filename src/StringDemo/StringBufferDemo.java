package StringDemo;

/**
 * Created by rajan on 9/10/17.
 */
public class StringBufferDemo {

    static double t1;
    static  Long t2;

    static void usingString()
    {
        String s="codekul";
        for (int i=0;i<=20000;i++)
        {
            s.concat("institute");
        }
    }

   static void getCount()
    {
        String s="sharayu";
        char count[]=s.toCharArray();
        int a=count.length;
        System.out.println(a);
    }

   static void usingStingBuffer()
    {
        StringBuffer s=new StringBuffer("codekul");
        for (int i=0;i<=20000;i++)
        {
            s.append("institute");
        }
    }


    public static void main(String[] args) {

        getCount();
//        t1=System.currentTimeMillis();
//        StringBufferDemo.usingString();
//        System.out.println("Time for String = "+(System.currentTimeMillis()-t1)+"ms");
//
//        t2=System.currentTimeMillis();
//        StringBufferDemo.usingStingBuffer();
//        System.out.println("Time for StringBuffer = "+(System.currentTimeMillis()-t2+"ms"));

    }

}
