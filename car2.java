import java.util.Scanner;
public class car2 
{
String name,model;
int year;

void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.print("Car name ");
name=sc.nextLine();
System.out.print("Car model ");
model=sc.nextLine();

year=sc.nextInt();
}

void showdata()
{

    System.out.println("Car name "+name);
     System.out.println("Car model "+model);
     
      System.out.println("Car year "+year);

}

    public static void main(String[] args) {
        
        car2 cr=new car2();
        
        cr.getdata();
        cr.showdata();
          
    }
}
