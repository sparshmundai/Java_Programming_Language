import java.util.Scanner;
public class binarye 
{
    public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Decimal Number");
int num=sc.nextInt();
int arr[]=new int[20];
for(int i=0;num>0;i++)
{
    arr[i]=num%2;
    num=num/2;
}
System.out.println("Binary No. ");
for(int i=1;i>=0;i--)
{
    System.out.println(arr[i]);
}
}
}
