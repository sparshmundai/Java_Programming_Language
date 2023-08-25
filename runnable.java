class test
{
public  void run()
{
    System.out.println("Hello World");
}
}
public class runnable extends test implements Runnable
{
    @Override
     public void run()
    {
        System.out.println("Run method executed");
    }
 public static void main(String[] args) 
 {
        runnable d = new runnable();
        d.run();
        Thread d1 = new Thread(d);
        d1.start();
       
        System.out.println("Main method excecuted");
    }   
}



