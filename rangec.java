import java.util.Scanner;
public class rangec 
{
public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
System.out.println("Enter the starting range");
int s =sc.nextInt();
System.out.println("Enter the ending range");
int e =sc.nextInt();
int sum=0;
for(int i=s ; i<=e ; i++)
{
    int c;
    c=i*i*i;
    sum=sum+c;
}
System.out.println("The sum of cube from " +s+ " to " +e+ " is "+sum );
}    
}
