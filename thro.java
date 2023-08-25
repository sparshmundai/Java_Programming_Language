class myexc extends Exception
{
    myexc(String Message)
    { 
        super(Message);
    }
}
public class thro
{
    public static void main(String[] args) 
    {
           int x=10, y=50;
     try {
         float z=(float)x/(float)y;
         if(z<6)
         {
             throw new myexc("Small number");
         }
     }
     catch (myexc e)
     {
         System.out.println("Cought exception");
     }
    }
}
 
  
    
    
    
    

    

