public class finalize 
{
   public void finalize() throws Throwable
   {
      System.out.println("Object garbage collected.");
   }
   public static void main(String[] args) {

      finalize t = new finalize();
      t = null;
      System.gc();
   }
}    

