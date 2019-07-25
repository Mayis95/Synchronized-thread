package Classes;

public class Caller
{
    public void func(String str)
    {
        try
        {
            for (int i = 0; i < str.length(); i++)
            {
                System.out.print(str.charAt(i));
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Thread "+Thread.currentThread().getName()+" interrupted");
        }
    }
}
