import java.util.Arrays;
import java.util.Scanner;
public class array_operation {



    //            for input in array
    public static void input(int[] number,int s, Scanner sc){
//        Scanner sc=new Scanner(System.in);
        for(int i=0; i<s; i++ ){
            System.out.printf("Enter %d element of an array : ", i + 1);
            number[i]=sc.nextInt();
        }
    }

    //            for print all element of array
    public static void print(int[] number){
        for (int j : number) {
            System.out.print(j+" ");
        }
        System.out.println();
    }

    //            for linear search
    public static int linearSearch(int[] number , Scanner sc ){
//        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.print("element which is you want to search : ");
        int key = sc.nextInt();
        System.out.println();
//        boolean r=false;
        int r=-1;
        System.out.println("By linear Search ");
        for (int j =0; j<number.length; j++) {
            if(number[j]==key){
                System.out.println("Index of element is "+j);
//                r=true;
                r=1;

        }
        }
        if(r==-1){
            System.out.println("Element not found ");
        }
        System.out.println();
        return key;
    }


    //            for Binary search
    public static void binarySearch(int[] number ,int key) {
        System.out.println("By binary search ");
        Arrays.sort(number);
        int r = -1, start = 0, end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (number[mid] == key) {
                System.out.println("Element is found. ");
                r = 1;
            }
            if(number[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        if(r==-1){
            System.out.println("Element not found. ");
        }
    }


    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int s;
        System.out.print("Enter length of array : ");
        s=sc.nextInt();
        int[] number=new int[s];

        input(number,s , sc);

        print(number);

        int key =linearSearch(number , sc);

        binarySearch(number, key);
    }
}
