package collage.Ragular_Expression;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mobileValidation {
    public static void main(String[] arg){

        String mobile="9234567898";

        String regex="^[6-9][0-9]{9}$";

        Pattern pattern=Pattern.compile(regex);
        Matcher match=pattern.matcher(mobile);

        if(match.matches()){
            System.out.println("valid mobile number ");
        }
        else{
            System.out.println("invalid mobile number ");
        }
    }
}
