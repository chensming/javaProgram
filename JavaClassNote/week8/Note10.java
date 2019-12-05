import java.io.Serializable;
import java.io.*;

class Person implements Serializable{
    private static final long serialVersionUID = 3934452894619663150L;
    private final String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "(Person: " + name + " )";
    }
}

public class Note10{
    public static void main(String args[]) throws IOException,ClassNotFoundException{
        String dataFile = "saved.dat";
        try(ObjectOutputStream output = new ObjectOutputStream(
            new BufferedOutputStream(
                new FileOutputStream(dataFile))
            )
        ) {
            //����д��int,String,Person
            output.writeInt(1000);
            output.writeUTF("Hello,Java!");
            output.writeObject(new Person("Alice"));
        }
        System.out.println("read...");
        try(ObjectInputStream input = new ObjectInputStream(
                new BufferedInputStream(
                    new FileInputStream(dataFile)
                )
            )
        ) {
            //���ζ���int,String,Person
            System.out.println(input.readInt());
            System.out.println(input.readUTF());
            Person p = (Person) input.readObject();
            System.out.println(p);
        }
    }
}