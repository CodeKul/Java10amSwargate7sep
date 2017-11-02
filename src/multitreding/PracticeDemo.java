package multitreding;

/**
 * Created by rajan on 26/10/17.
 */
public class PracticeDemo extends Thread {
    public void run()
    {
        for (int i=0;i<5;i++)
        {

            System.out.println("hiiii");
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
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
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
    public static void main(String[] args) throws InterruptedException {

        PracticeDemo practiceDemo=new PracticeDemo();
        Multi multi=new Multi();
        practiceDemo.setName("smita");
        multi.setName("sonaliiiiiiiiiiii");

        practiceDemo.setPriority(MIN_PRIORITY);
        multi.setPriority(MAX_PRIORITY);

        practiceDemo.start();

//        System.out.println(practiceDemo.getName());

        multi.start();

//        System.out.println(multi.getName());

    }
}
