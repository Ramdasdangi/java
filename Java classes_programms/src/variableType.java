/*public class variableType {
    public void localVariable() {
        String name = "ram ";
        int marks = 95;
        System.out.println(name + "scored " + marks);
    }

    public static void main(String[] args ){
        variableType vt = new variableType();
        vt.localVariable();
    }
}*/

public class variableType {
    public static String name;
    public static int marks;

    public static void main (String[] args) {
        name = "ram ";
        marks = 95 ;
        System.out.println(name + " scored " + marks);
    }
}




// variable is not declared static

/*public class variableType {
    public String name;
    public int marks;

    public static void main(String[] args) {
        name = "Ben";
        marks = 95;
        System.out.println(name + " Scored " + marks + "%.");
    }
}*/