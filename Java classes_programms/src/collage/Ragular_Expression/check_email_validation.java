package collage.Ragular_Expression;
import java.util.regex.*;

public class check_email_validation {
    public static void main(String[] arg){

        String email="student@gmail.com";

        String regex="^[A-Za-z0-9]+@(.+)$";

        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(email);

        boolean matchF=matcher.matches();

        if(matchF){
            System.out.println("email is valid ");
        }
        else{
            System.out.println("email invalid ");
        }
    }
}
