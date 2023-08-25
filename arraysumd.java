import java.util.Scanner;
public class arraysumd 
{
public static void main(String[] args) 
{
int arr[][]=new int[3][3];
Scanner sc =new Scanner(System.in); 
int i,j;
for(i=0;i<3;i++){ for(j=0;j<3;j++)
{
System.out.println("Enter the value of "+(i+1)+","+(j+1)+": "); 
arr[i][j]=sc.nextInt();
System.out.print("\n");
}
}
System.out.println("Printing the array"); 
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{ 
    System.out.print(arr[i][j]+" ");
}
System.out.print("\n");
}
int dig_left=0,dig_right=0; 
for(i=0;i<3;i++){
for(j=0;j<3;j++){ if(i==j)
{
dig_left=dig_left+arr[i][j];
}
if((i+j)==(3-1))
{
dig_right=dig_right+arr[i][j];
}
}
}
int sum=dig_left+dig_right;
System.out.println("Sum Of Left and Right Diagnal Element :"+sum);
}
}
