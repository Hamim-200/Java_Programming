package fileio;

import java.io.*;

public class SerializationMain {

    public static void main(String[] args) throws Exception {
        Student obj1 = new Student("Hamim", 1232323);
        Student obj2 = new Student("Tamim", 1239872323);

        File file = new File("object.dat");

        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));) {
            output.writeObject(obj1);
            output.writeObject(obj2);
        }

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));) {
            Student s1 = (Student) input.readObject();
            Student s2 = (Student) input.readObject();

            System.out.println(s1.toString());
            System.out.println(s2.toString());
        }
    }
}
