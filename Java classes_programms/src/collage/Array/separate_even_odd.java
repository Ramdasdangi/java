package collage.Array;

import java.util.ArrayList;

public class separate_even_odd {

    /*
    // this is simple method but there are some complexity occure

    public static void main(String[] arg){
        int[] arr={5,2,9,4,7,6};

        int even[] =new int[arr.length];
        int odd[] = new int[arr.length];
        int e=0;
        int o=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                even[e]=arr[i];
                e++;
            }
            else{
                odd[o]=arr[i];
                o++;
            }
        }

        System.out.println("even elements are");
        for (int i = 0; i < even.length ; i++) {
            if(even[i]!=0)
                System.out.print(even[i]+ " ");
        }

        System.out.println("\nodd elements are");
        for (int i = 0; i < odd.length; i++) {
            if(odd[i]!=0)
                System.out.print(odd[i]+" ");
        }

    }*/

    // this is traditional ArrayList method
    public static void main(String[] arg){
        int[] arr={5,2,9,4,7,6};
        ArrayList<Integer> even =new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 ==0){
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
        }

        System.out.println("Even elements are "+even);
        System.out.println("odd elements are "+odd);
    }
}
