package collage.Array;

public class compare_2_array {
    public static void main(String[] arg){
        int[] a1={1,2,3,4};
        int[] a2={1,2,3,4,5};

        boolean equal=true;

        if(a1.length!= a2.length){
            equal=false;
        }
        else {
            for (int i = 0; i < a1.length; i++) {
                if (a1[i] != a2[i]) {
                    equal=false;
                    System.out.println("arrays are not equal");
                    break;
                }
            }

        }
        if(equal){
            System.out.println("both arrays are equal");
        }
        else {
            System.out.println("arrays are not equal");
        }
    }
}
