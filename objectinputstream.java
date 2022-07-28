import java.io.*;

class Dog implements Serializable{
    String name;
    String breed;
    public Dog(String name,String breed)
    {
        this.name=name;
        this.breed=breed;

    }
}

public class objectinputstream {
    public static void main(String[] args) {
        Dog dog1 = new Dog("flappy","german");
        try{
            FileOutputStream fis = new FileOutputStream("D://output");
            ObjectOutputStream oos = new ObjectOutputStream(fis);
            oos.writeObject(dog1);

            FileInputStream fos = new FileInputStream("D://output");
            ObjectInputStream ois = new ObjectInputStream(fos);
            Dog newDog = (Dog) ois.readObject();
            System.out.println("breed "+newDog.breed);
            System.out.println("name "+ newDog.name);

         oos.close();
         ois.close();
        }
        catch (IOException | ClassNotFoundException e)
        {

        }

    }
}
