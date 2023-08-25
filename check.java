import java.awt.Checkbox;
import java.awt.Frame;
public class check 
{ 
     check() 
     {    
        Frame f = new Frame("COURSES: ");    
        Checkbox checkbox = new Checkbox("BCA");    
        checkbox.setBounds(100, 100,  50, 50);    
        Checkbox checkbox2 = new Checkbox("BBA", true);           
        checkbox2.setBounds(100, 150,  50, 50);     
        f.add(checkbox);    
        f.add(checkbox2);     
        f.setSize(400,400);    
        f.setLayout(null);    
        f.setVisible(true);    
     }    
public static void main (String args[])    
{    
    new check();    
}    
}  






    

