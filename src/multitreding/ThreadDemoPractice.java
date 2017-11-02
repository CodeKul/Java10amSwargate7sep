package multitreding;

/**
 * Created by rajan on 2/11/17.
 */

class ThreadDemoPractice extends Thread{
    public void run()
    {
        for (int i=0;i<5;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("rishab");
        }
        }

}

class SecondThread extends Thread
{
    public void run() {
        for (int j = 0; j < 5; j++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("sharayu");
        }
    }
    public static void main(String[] args) throws InterruptedException {

        ThreadDemoPractice t=new ThreadDemoPractice();
        SecondThread s=new SecondThread();
        s.setPriority(MAX_PRIORITY);
        t.setPriority(MIN_PRIORITY);
        t.start();
        s.start();
        System.out.println(t.getPriority());

        System.out.println(s.getPriority());
        s.join();

        System.out.println("in main thread");

    }
}
