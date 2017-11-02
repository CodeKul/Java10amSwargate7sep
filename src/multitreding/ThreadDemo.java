package multitreding;

/**
 * Created by rajan on 25/10/17.
 */
public class ThreadDemo extends Thread {

    public void run()
    {

        for (int i=0;i<5;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("codekul");
        }
        }

}
class ThreadDemoSecond extends Thread
{
    public  void run()
    {

        for (int j=0;j<5;j++)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("institute");
        }

    }
    public static void main(String[] args) {

        ThreadDemo threadDemo=new ThreadDemo();
        ThreadDemoSecond threadDemoSecond=new ThreadDemoSecond();
        threadDemo.start();
        threadDemoSecond.start();

//        threadDemo.start();

    }

}
