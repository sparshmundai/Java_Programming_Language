import java.util.Scanner;
public class data 
{
    public static void main(String[] args) 
  {    
    String name, des;
    int age ;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Name");
    name = sc.nextLine();
    System.out.println("Enter your  Age");
    age = sc.nextInt();
    System.out.println("Enter your Designation ");
    des = sc.next();
    System.out.println("Name = "+name+" Age = "+age+" Designation = "+des);    
}
}
