
package fileio;
import java.io.File;
import java.util.Scanner;
public class ReadDataMain {
    public static void main(String[] args) {
        File file = new File("hello.txt");
        
        
        try{
            Scanner input =  new Scanner (file);
            
            while(input.hasNext()){
                String firstName = input.next();
                String lastName = input.next();
                
                int id = input.nextInt();
                
                System.out.println("Name: "+firstName + " "+ lastName + "\tID "+id);
            }
            
            input.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
