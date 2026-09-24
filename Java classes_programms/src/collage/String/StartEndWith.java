//find out if the string start or end with the specific character

package collage.String;

public class StartEndWith {
    public static void main(String[] ar){
        String s="Hello TIT How are you?";

        System.out.println(s.startsWith("H"));
        System.out.println(s.startsWith("Hello TIT"));
        System.out.println(s.endsWith("you"));
        System.out.println(s.endsWith("you?"));
        System.out.println(s.startsWith("HelloTIT"));
    }
}
