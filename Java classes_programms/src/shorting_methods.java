import java.util.*;
import java.util.Collection;
public class shorting_methods {

    // Bubble Short method (short by the compare next and push at the end )
    public static void bubble_short(int [] num , int s) {
        int swap = 0;
        for(int i=0; i<s-1; i++) {

            for (int j = 1; j < s - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int t = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = t;
                    swap = 1;
                }
            }
            if (swap == 0) {       // this is for reduce time complexity
                System.out.println("ram");
                break;
            }
        }
    }

    // Selection Short method (find minimum value and push in first )
    public static void selection_short(int[] num, int s){
        for(int i=0; i<s-1; i++ ){
            int minposition=i;
            for (int j = i+1; j <s ; j++) {
//                if(num[minposition]<num[j])       // for decreasing order
                 if(num[minposition]>num[j])        // for increasing order
                    minposition=j;
            }

            int temp=num[minposition];
            num[minposition]=num[i];
            num[i]=temp;
        }
    }

    // insertion short method( compare and insert )
    public static void insertion_short(int[] num,int s){
        for(int i=1; i<s; i++){
            int curr=num[i];
            int pre=i-1;
            while(pre>=0 && num[pre]>curr){
                num[pre+1]=num[pre];
                pre--;
            }
            num[pre+1]=curr;
        }
    }

    // short by inbuild function
    public static void Inbuild_short(int[] num,int n){
        // shorting array in ascending order
//        Arrays.sort(num);
//        Arrays.sort(num,0,n-1 );  // sorting of array between index to index

        // shorting array in descending order
        Arrays.sort(num , Collections.reverseOrder());
        Arrays.sort(num, 0, n-2, Collections.reverseOrder());

    }
    //  for print shorted array
    public static void print(int[] num ){
        int s= num.length;
        System.out.print("Array after shorting : ");
        for(int i=0; i<s; i++ ){
            System.out.print(num[i]);
        }
    }

    public static void main(String [] arg){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n= sc.nextInt();
        System.out.println("Enter element of the array or numbers : ");
        int[] num = new int[n];
        for(int i = 0; i<n; i++){
            num[i]=sc.nextInt();
        }

//        bubble_short(num, n);
//        selection_short(num,n);
//        insertion_short(num,n);
        Inbuild_short(num,n );

        print(num);   // for printing shorted array
    }
}
