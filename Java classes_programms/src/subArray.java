public class subArray {

    //             Program for print sub arrays
    public static void print_subarrays(int[] num){
        int total=0;
        for(int i=0; i<num.length ; i++){
            for(int j=i; j< num.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print("["+num[k]+"]");
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub_Array is "+total);
    }

    //      MAX SUM OF SUB_ARRAY BY USING NORMAL METHOD or BRUTE FORCE , BUT time complexity is O(n3)
    public  static void sum_normal(int[] num){
        int c_sum=0;
        int max_sum=Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                c_sum=0;
                for(int k=i; k<=j; k++){
                    c_sum+=num[k];
                    System.out.print("["+num[k]+"] ");

                }
                System.out.println(" =  "+c_sum);
                if(max_sum<c_sum)
                    max_sum=c_sum;
            }
            System.out.println();
        }
        System.out.println("Max sum of subArray is "+max_sum);
    }

    //       MAX SUM OF SUB_ARRAY BY USING  PREFIX SUM , time complexity is O(n2)
    public static void sum_prefix(int[] num){
        int c_sum=0;
        int max_sum=Integer.MIN_VALUE;
        int[] prefix= new int[num.length];

        prefix[0]=num[0];
        //prefix calc
        for(int i=1; i< prefix.length; i++){
            prefix[i]=prefix[i-1]+num[i];
        }

        for(int i=0; i< num.length; i++){
            for(int j=0; j< num.length; j++){

                c_sum = i==0 ? prefix[j] : prefix[j]-prefix[i-1];

                if(max_sum<c_sum)
                    max_sum=c_sum;
            }
        }
        System.out.println("Max sum of subArray is "+max_sum);

    }

    //        MAX SUM OF SUB_ARRAY BY USING KADANE's ALGORITHMS , time complexity is O(n)
    public static void sum_kadane(int[] num){
        int c_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0; i< num.length; i++){
            c_sum+=num[i];
            if(c_sum<0)
                c_sum=0;
            max_sum=Math.max(c_sum,max_sum);
        }
        System.out.println("Max sum of subArray is "+max_sum);

    }

    public static void main(String[] arg){
        int[] number ={1,2,3,-1,5,-1,6};
//        print_subarrays(number);
//        sum_normal(number);
//        sum_prefix(number);
        sum_kadane(number);
    }
}

/*
[1,2,3,4,5]
[1], [1,2], [1,2,3], [1,2,3,4], [1,2,3,4,5]
[2], [2,3], [2,3,4], [2,3,4,5]
[3], [3,4], [3,4,5]
[4], [4,5]
[5]
 */