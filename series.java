
import java.util.Scanner;


public class series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num,a=0,i;
        num=sc.nextInt();
        for(i=0;i<=num;i++)
        {
            a=a*10+1;
            System.out.println(a);
        }
    }
}
