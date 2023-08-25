import java.awt.Button;
import java.awt.Label;
import java.awt.Frame;
import java.awt.TextField;
public class tx 
{
    tx() 
    {  
     Frame f = new Frame ("Label Example");
     Button b=new Button("Button");
     TextField t = new TextField();
     TextField t2 = new TextField();
     java.awt.Label l1 = new java.awt.Label("First Label");
     b.setBounds(150,250,100,50);
     l1.setBounds(20,100,80,30);
     t.setBounds(200,100,80,30);
     f.add(l1);
     f.add(b);
     f.add(t);
     f.setSize(400,400);
     f.setLayout(null);
     f.setVisible(true);
    }
    public static void main(String[] args) 
    {
        tx obj = new tx();
    }   
}

    

