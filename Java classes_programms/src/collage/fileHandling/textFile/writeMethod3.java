// This is modern method
//  Using NIO (Recommended for Modern Java)

package collage.fileHandling.textFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class writeMethod3 {
    public static void main(String[] arg){
        try {
            Path path = Path.of("classic.txt");

            Files.createFile(path);

            System.out.println("File created.");
        }
        catch (IOException e){
            System.out.println("ERROR : "+e.getMessage());
        }
    }
}
