public class pattern_half_pyramid {
    public static void number_tri(int n){
        for(int i=1; i<=n ; i++){
            for(int h=1; h<=i; h++){
                System.out.print(h+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=n;i>=1 ; i--){
            for(int j=1; j<=i; j++){

                    System.out.print(j + " ");

            }
            System.out.println();
        }
    }

    public static void floid_tri(int n){
        int a=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }


    public static void zero_one_triangle(int n){
        for(int i=1; i<=n; i++){
            for(int h=1; h<=i; h++){
                if((i+h)%2==0){
                    System.out.print('0');
                }else {
                    System.out.print('1');
                }
            }
            System.out.println();
        }
    }

    public static void main(String[ ] arg){
        int n=5;
//        number_tri(n);

//        floid_tri(n);

        zero_one_triangle(n);
    }
}
