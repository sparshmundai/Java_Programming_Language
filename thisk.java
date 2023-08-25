  public class thisk
{
 void show()
{
    System.out.println(this);
}
 public static void main(String[] args) 
 {
   
thisk ref=new thisk();
System.out.println(ref);
  ref.show();
     
}
}
