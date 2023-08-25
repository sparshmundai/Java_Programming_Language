import java.util.Scanner;
public class insertions 
{
public static void main(String[] args) 
{
Scanner sc =new Scanner(System.in); 
int arr[] = new int[10];
int i,j,temp; 
for(i=0;i<10;i++)
{
arr[i] = sc.nextInt();
}
for(i=1;i<10;i++)
{ 
    for(j=i;j>0;j--)
    {
if(arr[j]<arr[j-1])
{ 
    temp=arr[j]; 
    arr[j]=arr[j-1]; 
    arr[j-1]=temp;
}
}
}
System.out.println("Sorted array are: \n"); 
for(i=0;i<10;i++)
{
System.out.println(arr[i]);
}
}
}


