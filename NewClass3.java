
import java.awt.*;

public class NewClass3 {
    public static void main(String[] args) {
        Frame f = new Frame("lable example");
        Label l1 =new Label("First Label");
        Label l2 = new Label("Second Label");
        Button b=new Button("Button");
        l1.setBounds(50,100,100,30);
        l2.setBounds(50,150,100,30);
        b.setBounds(50,250,100,30);
        f.add(b);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
   
    }
}
