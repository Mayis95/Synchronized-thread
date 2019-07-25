package Classes;

public class MyThread extends Thread
{
    Caller cl;
    String msg;
    public MyThread(Caller ob, String s)
    {
        cl=ob;
        msg=s;
    }
    public void run()
    {
        synchronized(cl)
        {
            cl.func(msg);
        }
    }
}