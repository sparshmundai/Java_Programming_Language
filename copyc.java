public class copyc 
{
int a; 
String b;

copyc()
{
 a = 10;
 b="learn coding";
 System.out.println(a+" "+b);
}
copyc(copyc ref)
{
    a=ref.a;
    b=ref.b;
System.out.println(a+" "+b);
}
 public static void main(String[] args) 
    {
    
        copyc r = new copyc();
        copyc r2 = new copyc(r);
    }
}
