class o
{
int a ,b,c=0;
void add()
{
    a=10; b=20;
    c=a+b;
    System.out.println("Sum of two number"+c);
}
void sub()
{
    a=200; b=100;
    c=a-b;
    System.out.println("Sub of two number"+c);        
}
}
class b extends o
{
void mul()
{
    a=100; b=500;
    c=a*b;
    System.out.println("Multiplication of two number"+c);        
}
void div()
{
    a=300; b=50;
    c=a/b;
    System.out.println("Division of two number"+c);        
}
}
class c extends b
{
    void rem()
    {
    a=45; b=70;
    c=a%b;
    System.out.println("Remainder of two number"+c);   
    }
}
public class mulin 
{
 public static void main(String[] args) 
    {
       c ref = new c();
       ref.add();
       ref.sub();
       ref.mul();
       ref.div();
       ref.rem();
    }    
        
 }

   

