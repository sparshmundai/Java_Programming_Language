import java.util.Scanner;
public class arraysum 
{
public static void main(String[] args) 
{
Scanner obj=new Scanner(System.in);
int arr[]=new int[10];
int sum=0;
for(int i=0;i<10;i++)
{
    System.out.println("Enter "+(i+1)+ " Element");
    arr[i]=obj.nextInt();
}
for(int i=0;i<10;i++)
{
    sum = sum+arr[i];
}
    System.out.println("Sum of array elements "+sum);     
}
}