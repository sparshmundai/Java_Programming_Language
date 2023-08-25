import java.util.Scanner;
public class arrayb 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int arr[][] = new int[3][3];
int i,j,suma=0,sumb=0;
System.out.println("Enter the element into array: "); 
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.println("Enter the element :"+i+","+j+" : "); 
arr[i][j]=sc.nextInt();
}
}
System.out.println("Displaying the array"); 
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{ 
System.out.print(arr[i][j]+" ");
}
System.out.print("\n");
}
for(i=0;i<3;i++)
{ 
for(j=0;j<3;j++)
{
if(i==0 || j==0 || i==2 || j==2)
{ 
sumb = sumb + arr[i][j];
}
else
{
suma = suma + arr[i][j];
}
}
}
System.out.println("The sum of bordered elements are : "+sumb);
System.out.println("The sum of non bourdered elements are : "+suma);
}
}           

      


    

