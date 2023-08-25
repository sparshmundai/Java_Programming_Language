class demo
{
   void input()
    {
        System.out.println("Enter the Name"); 
    }
   
 class b extends demo
 {
     void show()
     {
         System.out.println("My name is Ankit");
     }    
 }
 class c extends demo
 {
     void disp()
     {
         System.out.println("My name is Ankush");
     }
 }  
}
public class herinh 
{
    public static void main(String[] args) 
 {   
 b ref=new b();
 c ref2=new c();
 
 ref.input();
 ref.show();
 ref2.input();
 ref2.disp();
}
}

