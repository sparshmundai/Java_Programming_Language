import java.util.Scanner;
public class linears 
{
public static void main(String[] args) 
{
Scanner sc =new Scanner(System.in);
int arr[]=new int[10];
int i,flag=0; for(i=0;i<10;i++){
arr[i]=sc.nextInt();
}
System.out.println("Enter the element to be search: "); 
int num = sc.nextInt();
for(i=0;i<10;i++){ if(arr[i] == num){
flag=1; 
break;
}
else
{
}
}
if(flag == 1){
System.out.println("Your no: Found at "+(i+1));
}
else
{
System.out.println("Your number not found");
}
}
}



        
        


