// This is by creating new file and copy file content
package collage.fileHandling.Extenssion_Change;

import java.io.File;

public class ByCreatingNewFile {
    public static void main(String[] arg){

        File oldfile=new File("classic.txt");
        File newfile=new File("classic.csv");
        if(oldfile.renameTo(newfile)){
            System.out.println("File extension change successfully.");
        }
        else{
            System.out.println("Failed to change extension");
        }
    }
}
