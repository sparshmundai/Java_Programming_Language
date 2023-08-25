interface show
{
    int amount();
}
class car implements show
{
@Override
public int amount()
{
return 9000; 
}
}
class bike implements show
{
@Override
public int amount()
{
    return 10000;
}
}
public class inter 
{
    public static void main(String[] args) 
    {
     car obj=new car();
     bike b=new bike();
     b.amount();
     obj.amount();
     System.out.println("CAR  " +obj.amount());
     System.out.println("Bike  " +b.amount());   
    } 
}


