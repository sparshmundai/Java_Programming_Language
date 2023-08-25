
public class NewClass2 
{
float length;
float bredth;

void ro(float x, float y)
{
length=x;
bredth=y;
}

void ro(float f)
{
    length=f;
    bredth=10;
}
 public static void main(String[] args) 
    {
        NewClass2 r1=new NewClass2();
         NewClass2 r2=new NewClass2();
        
        r1.ro(7,8);
        r2.ro(8);
    
    }
}



