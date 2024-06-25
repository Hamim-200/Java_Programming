package fileio;

import java.io.*;

public class DataStream {

    public static void main(String[] args) throws IOException {
        File file = new File("temp2.dat");

        try (DataOutputStream output = new DataOutputStream(new FileOutputStream(file));) {
            output.writeUTF("Sujit");
            output.writeInt(24);
            output.writeDouble(50.5);
        }

        try (DataInputStream input = new DataInputStream(new FileInputStream(file));) {
            System.out.println(input.readUTF());
            System.out.println(input.readInt());
            System.out.println(input.readDouble());

        }

    }

}
