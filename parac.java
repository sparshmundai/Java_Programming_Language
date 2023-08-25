public class parac 
{
    int x,y;
    parac(int a , int b )
    {
        x=a;
        y=b;
    }   
    void show()
    {
        System.out.println(x+" "+y);
    }
    parac(int x, String y)   
    {

        System.out.println(x+" "+y);
    }
 public static void main(String[] args) 
    {
        parac c = new parac(100,200);
        c.show();
        parac ref = new parac(10,"ankush");
    }
}
                                                                                                                                            

    


