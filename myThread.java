public class myThread extends Thread
{
    public void run()
    {
        try
        {
            for(int i = 0; i < 10; i++)
            {
                System.err.println("i am lazy thread");
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e)
        {
            System.err.println("i got interrupted");
        }
    }

    
}

class ThreadSleepDemo
{
    public static void main(String A[])
    {
        myThread t = new myThread();
        t.start();
        t.interrupted();

        System.out.println("end of main");
    }
}