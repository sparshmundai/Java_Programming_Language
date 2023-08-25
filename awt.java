import java.awt.Button;
import java.awt.Frame ;
public class awt extends Frame
{
    awt()
          {
              Button b=new Button("Click me!!");
              b.setBounds(30,100,80,30);
              add(b);
              setSize(300,300);
              setTitle("button example");
              setLayout(null);
              setVisible(true);
          }  
public static void main(String[] args) 
{
 awt r=new awt();
}
}
    

