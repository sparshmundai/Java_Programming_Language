public class finall 
{
public static void main(String[] args) 
{
try
{
    int i=100/0;
}
catch(ArithmeticException e)
{
    System.out.println(e);
}
finally
{
System.out.println("finslly");
}
}
}