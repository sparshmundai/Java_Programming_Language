import java.util.Scanner;
public class demo2 
{
    public static void main(String[] args) 
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter three number");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        
        if((a >b) && (a > c))
	{
	 System.out.println("The Greatest Is "+a);
	}
	 else if(b > c)
	 {
          System.out.println("The Greatest Is "+b);
	 }
	    else
         {
             System.out.println("The Greatest Is "+c);
	  }	
}
}
