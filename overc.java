
public class overc 
{
int a; 
double b; 
String c;

overc()
{
    a=100;
    b = 45.65;
    c="ankit";
}

overc(int x)
{
    a=x;
}
overc(double y, String z)
{
    b = y;
    c = z;
}
public static void main(String[] args) 
    {
      overc ov=new overc(); 
        overc ov2=new overc(10);
        overc ov3=new overc(23.45,"ankush");
        System.out.println(ov.a+" "+ov.b+ " "+ov.c);
        System.out.println(ov2.a);
        System.out.println(ov3.b+ " "+ov3.c);
        
    }
}

