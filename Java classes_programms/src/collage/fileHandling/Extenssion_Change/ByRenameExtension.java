//change file extension by change only extension of the file

package collage.fileHandling.Extenssion_Change;

import java.io.File;

public class ByRenameExtension {
    public static void main(String[] arg){

        File oldfile = new File("student.txt");

        String name=oldfile.getName();
        int dotIndex= name.lastIndexOf('.');

        String newname = (dotIndex==-1)
                ?name+".csv"
                :name.substring(0,dotIndex)+".csv";

        File newFile= new File(oldfile.getParent(),newname);

        if(oldfile.renameTo(newFile)){
            System.out.println("file extension change successfully");
        }
        else{
            System.out.println("failed to change file extension");
        }

    }
}
