public class array_reverse {

    public static void reverse(int[] number){
        int f=0,l=number.length-1;
        while(f<l){
            int t=number[f];
            number[f]=number[l];
            number[l]=t;
            f++;
            l--;
        }
        for(int i=0; i<number.length; i++){
            System.out.print(number[i]+" ");
        }
    }

    public static void main(String [] srg){
        int[] number={1,2,3,4,5,6,7,8,9,10,11,12,13,114};
        reverse(number);

    }
}
