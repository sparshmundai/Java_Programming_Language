import java.util.Scanner;
public class fab 
{
public static void main(String[] args) 
{
int i=1 ,temp, a=0, b=1;    
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the end series");
      int  num=sc.nextInt();
       System.out.println("Fibonnaci Series till " +num+ " terms ");
       do{
           System.out.println(a);
       temp=a+b;
       a=b;
       b=temp;
       i++;
       }while(i<=num);
}
}
