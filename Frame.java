import java.awt.Button;
import java.awt.Label;
import java.awt.Frame;
import java.awt.List;
public class Frame 
{
    public static void main(String[] args) 
    { 
     Frame f = new Frame("Label Example");
     Button b=new Button("Button");
     Label l1 = new Label("First Label");
     Label l2 = new Label("Second Label");
     b.setBounds(200,200,80,30);
     l1.setBounds(20,100,80,30);
     l2.setBounds(20,150,100,30);
     f.add(l1);
     f.add(l2);
     f.add(b);
     f.setSize(400,400);
     f.setLayout(null);
     f.setVisible(true);
    }

    void add(List l1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setSize(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

