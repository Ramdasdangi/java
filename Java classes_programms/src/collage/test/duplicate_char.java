package collage.test;

public class duplicate_char {
    public static void main(String[] arg){
        String name="Ramdas";

        for(int i=0; i<name.length();i++){
            char c=name.charAt(i);
            for(int j=i+1;j<name.length()-1;j++){
                if(c==name.charAt(j)){
                    System.out.println("dublicate charecter is "+name.charAt(i));
                }
            }
        }
    }
}
