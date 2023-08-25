public class City 
{
public String name ;
public long polpulation ;
public void display()
{
    System.out.println("City name: "+name);
    System.out.println("Population: "+polpulation);
}
public static void main(String[] args) {
    City num1,num2;
    num1=new City();
    num2=new City();
    num1.name="delhi";
    num1.polpulation=100000;
    System.out.println("Details of metro city");
    num1.display();
    
    num2.name="Banglore";
    num2.polpulation=50000;
    System.out.println("Details of metro city");
    num2.display();
}
}
