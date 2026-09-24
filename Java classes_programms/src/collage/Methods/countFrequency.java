//count frequency of element using method

package collage.Methods;

public class countFrequency {

     static void countF(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            int count=1;
            if(arr[i]==-1)
                continue;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=-1;
                }
            }
            System.out.println(arr[i]+" OCCURS "+count+" times.");
        }

    }

    public static void main(String[] arg){
        int[] arr={5,7,5,4,-1,-8,7,8,4,5,5,4};
        countF(arr);

    }
}

// create same program with different logic or different syntax like for each loop
// and create using hash map