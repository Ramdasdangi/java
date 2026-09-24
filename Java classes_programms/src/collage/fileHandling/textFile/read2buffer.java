//  Using buffer reading this method is more efficient

package collage.fileHandling.textFile;

import java.io.BufferedReader;
import java.io.FileReader;

public class read2buffer {
    public static void main(String[] arg) {
        try (BufferedReader br = new BufferedReader(new FileReader("student.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("error " + e);
        }
    }
}