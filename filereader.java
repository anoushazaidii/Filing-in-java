import java.io.FileWriter;
import java.io.IOException;

class filewriter{
    public static void main(String[] args) {
        FileWriter fw = null;
        try{
            fw = new FileWriter("D://mytxt.txt");
            fw.write("my new file");
            fw.close();
        }
        catch (IOException e) {

            System.out.println(e);
        }
        System.out.println("success");
    }
}