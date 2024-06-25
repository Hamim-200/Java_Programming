
package fileio;
import java.io.File;
import java.util.Date;
public class FileIO {

    
    public static void main(String[] args) {
        File file = new File("img.jpg");
  
        System.out.println("Does it exist? "+ file.exists());
        System.out.println("The file has "+ file.length() + "bytes");
        System.out.println("Can it be read? "+file.canRead());
        System.out.println("Can it be written? "+ file.canWrite());
        System.out.println("Is it be directory? "+file.isDirectory());
        System.out.println("is it a file? "+ file.isFile());
        System.out.println("Is it absolute?"+file.isAbsolute());
        System.out.println("Is it hidden?" + file.isHidden());
        System.out.println("Absolute path is "+file.getAbsolutePath());
        
    }
    
}
