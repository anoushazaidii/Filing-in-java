import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class dataoutputstream {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("D://myoutputstream");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(50);
            dos.writeChars("Anousha");
            dos.close();
            System.out.println("success");
        }

        catch(IOException ae)
        {

        }
    }
}
