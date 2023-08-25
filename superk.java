class a
{
    int a=10;
}
class bd extends a
{
int a=20;
void show()
{
System.out.println(a);
System.out.println(super.a);
}
}
public class superk
{
     public static void main(String[] args) 
     {
        bd r=new bd();
        r.show();
    }
}

    

