//  This classic method write in file using File class

package collage.fileHandling.textFile;

import java.io.File;
import java.io.IOException;

public class writeMethod1 {
    public static void main(String[] arg){

        try{
            File file = new File("classic.txt");

            if(file.createNewFile()){
                System.out.println("file creates successfull. ");
            }
            else{
                System.out.println("file already exist . ");
            }
        }catch (IOException e){
            System.out.println("Error :"+e.getMessage());
        }
    }
}
