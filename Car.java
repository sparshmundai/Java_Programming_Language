
import java.util.Scanner;

public class Car 
{
String model, type;
void getdata()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter car name");
model = sc.nextLine();

System.out.println("Enter car type");
type = sc.nextLine();
}
void showdata()
{
    System.out.println("Car Model "+model);
    System.out.println("Type of a car "+type);
}
    public static void main(String[] args) 
       
    {
        Car c = new Car();
        c.getdata();
        c.showdata();
       
    }
}
