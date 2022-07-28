import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class datainputstream {
  public static void main(String[] args) {
   try{
      FileInputStream dis = new FileInputStream("D://myoutputstream");
      DataInputStream fis = new DataInputStream(dis);
       System.out.println(dis.read());
       dis.close();

     }
        catch (IOException e)
        {
    }
}
    }
