/**
 * Created by rajan on 25/10/17.
 */
public class abc extends Thread {

   public void run()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println("hiiii");
        }
    }
}
class Multi extends Thread
{
   public void run()
    {
        for (int i=0;i<5;i++)
        {

            System.out.println("hellooo");
        }
    }
    public static void main(String[] args) {
        abc a=new abc();
        Multi multi=new Multi();

        a.start();
        multi.start();
    }

}


