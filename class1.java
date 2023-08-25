public class class1 
{
   public String name;
   public long population;
   
   public void display()
   {
    System.out.println("City name"+name);
    System.out.println("Population "+population);
   }
    public static void main(String[] args) {
   
        class1 new1,new2;
        
        new1=new class1();
        new2=new class1();
        new1.name="delhi";
        new1.population=10000;
        System.out.println("Details of metro details");
        new1.display();
        
        new2.name="banglore";
        new2.population=50000;
       System.out.println("Details of metro details");
       new2.display();
        
        
     
}
    
}
