package collage.Array;

import java.util.Arrays;
import java.util.Collections;

public class sorting_array_ascending {
    public static void main(String [] arg){
        Integer[] arr = {5,2,9,1,7,3};

        Arrays.sort(arr);

        System.out.println("sorting array is "+Arrays.toString(arr));

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("sorting array is "+Arrays.toString(arr));

        System.out.println("largest element : "+arr[0]);
    }
}

