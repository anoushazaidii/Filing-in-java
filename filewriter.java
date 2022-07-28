import java.io.FileReader;
import java.io.IOException;

class filereader{
    public static void main(String[] args) {
        FileReader fr = null;
        try{
            fr = new FileReader("D://mytxt.txt");
            int next;
            while ((next=fr.read())!=-1)
            {
                System.out.println((char)next);
            }
            fr.close();
        }
        catch(IOException ae)
        {
            System.out.println(ae);
        }
    }
}