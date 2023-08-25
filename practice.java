class abc
{
int roll,marks;
String name;
void input()
{
    
System.out.println("Enter roll , marks and name= " +roll+" "+marks +" " +name);
}
}

class ankit extends abc      
{
void disp()
{
   roll=10;
   marks=89;
    name="amit";
}
}
public class practice
{
public static void main(String[] args) 
{
ankit a=new ankit();
a.disp();
a.input();


    }
}
