//  Read text file using Scanner method

package collage.fileHandling.textFile;

import java.io.File;
import java.util.Scanner;

public class read1 {
    public static void main(String [] arg){

        try{
            File file= new File("classic.txt");
            Scanner s=new Scanner(System.in);

            while(s.hasNextLine()){
                String line=s.nextLine();
                System.out.println(line);
            }
            s.close();
        }
        catch (Exception e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}
