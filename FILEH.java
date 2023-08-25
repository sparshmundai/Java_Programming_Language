
import java.io.*;
public class FILEH 
{
    public static void main(String[] args) throws IOException 
    {
    File inFile = new File("input.dat");
    File outFile = new File("output.dat");
     FileReader ins = null;
     FileWriter out = null;
        try
        {
            ins=new FileReader(inFile);
            out= new FileWriter(outFile);
            int ch = 0;
            while {ch!=-1}
            {
                out.write(ch);
            }
        }
         catch(IOException e)
        {
            System.out.println(e);
        }
        FileReader()
                {
                 ins.close();
                 out.close();
                }
    }

}
    













    
}
