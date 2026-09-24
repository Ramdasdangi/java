// File create at a specific location

package collage.fileHandling.textFile;

import java.io.File;
import java.io.IOException;

public class writeMethod2 {
    public static void main(String[] arg){

        try{
            File file= new File("R:\\JAVA\\java\\method2.txt");
            if(file.createNewFile()){
                System.out.println("File created successfull.");
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
