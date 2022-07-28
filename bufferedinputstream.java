import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class bufferedinputstream {
    public static void main(String[] args) {
        FileOutputStream fos= null;
        try{
            fos = new FileOutputStream("D://mybufferedstream");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            String s = "my first buffered stream ";
            byte b[]=s.getBytes();
            bos.write(b);
            bos.close();
            fos.close();
            System.out.println("successfully written");

        }
        catch (IOException e)
        {
    }
}
    }
