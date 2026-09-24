package collage.Ragular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//import java.util.regex.*;

public class Main {
    public static void main(String[] arg){
        Pattern pattern=Pattern.compile("TITcollege",
        Pattern.CASE_INSENSITIVE);

        Matcher matcher=pattern.matcher("Visit TITCollege!");

        boolean matchFound=matcher.find();
        if(matchFound){
            System.out.println("Match found");
        }
        else{
            System.out.println("Match not found");
        }

    }
}
