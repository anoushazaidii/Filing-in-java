import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class bufferedoutputstream {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("D://mybufferedstream");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int next;
            while((next=bis.read())!=-1)
            {
                System.out.println((char)next);
            }
            bis.close();
            fis.close();
        }
        catch (IOException ae)
        {
            System.out.println(ae);
        }
    }
}
