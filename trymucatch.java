public class trymucatch 
{
public static void main(String[] args) 
{
try
{
    String s=null;
    System.out.println(s.length());
}
catch(ArithmeticException e)
{
    System.out.println(e);
}
catch(Exception w)
{
    System.out.println("Parent exception occur");
}
catch(ArrayIndexOutOfBoundsException e)
{
    System.out.println("ArrayIndexOutOfBounds exception occur");
}
 System.out.println("rest of the code");
            
}
}
