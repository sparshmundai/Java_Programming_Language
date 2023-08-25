import java.util.Scanner; 
public class sumeven
{
public static void main(String[] args) 
{
Scanner obj=new Scanner(System.in);
int arr[]=new int[10];
int i,sumodd=0;
float sumeven=0,count=0;
for(i=0;i<10;i++)
{
    System.out.println("Enter "+(i+1)+ " Element");
    arr[i]=obj.nextInt();
}
for( i=0;i<10;i++)
{
if(arr[i]%2==0)
{
    sumeven=sumeven+arr[i];;
    count++;
}   
else 
{
        sumodd=sumodd+arr[i];
}
}
sumeven=sumeven/count;
System.out.println("Sum of Odd elements "+sumodd);
System.out.println("Average of even elements "+sumeven);
}
}    

