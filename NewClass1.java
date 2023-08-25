
public class NewClass1 {
 
    int add(int a, int b)
    {
        return a+b;
    }
   double add(double a, double b)
   {
       return a+b;
   }
   
  public static void main(String[] args) 
    {
        
        NewClass1 nc=new NewClass1();
        NewClass1 nc2=new NewClass1();
        
        nc.add(4,5);
        nc2.add(5.4,5.5);
       
  }
}

 
   
 