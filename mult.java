public class mult extends Thread
{
    public void run()
    {
        System.out.println("Run method excuted ");
    }
    public static void main(String[] args) 
{
    mult m1=new mult();
    m1.start();
    System.out.println("Main method executed");
}    
}
