import java.util.*;

public class sorting_methods {

    // Bubble Sort method (short by the compare next and push at the end )
    public static void bubble_sort(int [] num , int s) {
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

    // Selection Sort method (find minimum value and push in first )
    public static void selection_sort(int[] num, int s){
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

    // Insertion Sort method( compare and insert )
    public static void insertion_sort(int[] num,int s){
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

    // Sort by Inbuild function
    public static void Inbuild_sort(int[] num,int n){
        // shorting array in ascending order
        Arrays.sort(num);
        Arrays.sort(num,0,n-1 );  // sorting of array between index to index

        // shorting array in descending order
//        Arrays.sort(num , Collections.reverseOrder());
//        Arrays.sort(num, 0, n-2, Collections.reverseOrder());

    }

    // counting sort  In this method we sort element in +ve range
    public static void counting_sort(int [] num , int n){
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            largest = Math.max(largest , num[i]);
//            if(largest<num[i])
//                largest=num[i];
        }

        int[] count = new int[largest+1];
        for (int i = 0; i < n; i++) {
            count[num[i]]++;
        }

        // Sorting
        int j=0;
        for (int i = 0; i <count.length ; i++) {
            while (count[i]>0){
                num[j]=i;
                j++;
                count[i]--;
            }
        }
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
        int [] num = new int[n];
        for(int i = 0; i<n; i++){
            num[i]=sc.nextInt();
        }

//        bubble_sort(num, n);
//        selection_sort(num,n);
//        insertion_sort(num,n);
//        Inbuild_sort(num,n );
        counting_sort(num , n);

        print(num);   // for printing shorted array
    }
}
