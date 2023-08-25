
public class trycfin
{
    public static void main(String[] args) {
try
{
   int num =30/5 ;
   System.out.println(num);
}
catch(NullPointerException  e)
{
    System.out.println(e);
}
finally
{
    System.out.println("Finally block occur");
}
System.out.println("Rest of the code");
}
}
