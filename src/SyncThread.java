import Classes.*;

public class SyncThread
{
    public static void main(String args[])
    {
       Caller obj=new Caller();
       MyThread ob1=new MyThread(obj, "First string");
       MyThread ob2=new MyThread(obj, "Second string");
       MyThread ob3=new MyThread(obj, "Third string");
       ob1.start();
       ob2.start();
       ob3.start();
       try
       {
           ob1.join();
           ob2.join();
           ob3.join();
       }
       catch (InterruptedException e)
       {
           System.out.println("Interruption");
       }
    }
}
