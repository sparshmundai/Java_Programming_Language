import java.util.Scanner;
public class numpn 
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=sc.nextInt();
    if(num==0)
    {
        System.out.println("Positive = "+num);
    }
    else if (num<0 && (num%2)!=0)
    {
        System.out.println("Negative Odd = "+num);
    }
    else if(num<0 &&(num%2)==0)
    {
        System.out.println("Negative Even = "+num);
    }
    else if(num>0 &&(num%2)!=0)
    {
        System.out.println("Positive Odd = "+num);
    }
    else if(num>0 &&(num%2)==0)
    {
        System.out.println("Positive Even = "+num);  
    }
} 
}

