import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

class FileStream {
    public static void main(String[] args) {
        FileInputStream fis= null;
        try{
          fis= new FileInputStream("D://mydata.txt");
          int next;
          while((next=fis.read())!=-1)
          {
              System.out.println("next="+(char)next);
          }
          fis.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        FileOutputStream fos =null;
        try{
             fos = new FileOutputStream("mydata.txt");
             for(int i=65;i<75;i++)
             {
                 fos.write(i);
             }
             fos.close();
        }
        catch(IOException ae)
        {
            System.out.println(ae);
        }
    }
}

