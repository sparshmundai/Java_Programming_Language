public class prio extends Thread 
{
@Override
public void run()
{
  System.out.println("Inside the method");  
}
public static void main(String[] args) 
{
Thread.currentThread().setPriority(7);
System.out.println("Priority of the main thread "+Thread.currentThread().getPriority());
prio t1 = new prio();
System.out.println("Priority of the thread t1 is "+t1.getPriority());
}    
}
