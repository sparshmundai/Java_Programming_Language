import java.awt.Frame; 
import java.awt.List;
public class LI 
{
     LI()
     {    
        Frame f = new Frame();
        List l1 = new List(5);     
        l1.setBounds(100, 100, 75, 75);    
        l1.add("RITZ");    
        l1.add("CIVIC");    
        l1.add("AUDI");    
        l1.add("ALTO");    
        l1.add("BEAT");     
        f.add(l1);   
        f.setSize(400, 400);    
        f.setLayout(null);    
        f.setVisible(true);    
     }    
public static void main(String args[])    
{    
   new LI();    
}    
}
