package collage.Array;
import java.util.*;
public class minTOmax {
        public static void main(String[] nums) {
            // write your code here
            Scanner s = new Scanner(System.in);
            int t = s.nextInt();
            while (t > 0) {
                t--;
                int n = s.nextInt();
                int[] ar = new int[n];
                int m = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for (int i = 0; i < n; i++) {
                    ar[i] = s.nextInt();
                    if (ar[i] < m) {
                        m = ar[i];
                    }
                    if (ar[i] > m) {
                        max = ar[i];
                    }
                }

                int c = 0;
                while (max > m) {
                    for (int i = 0; i < n; i++) {
                        if (ar[i] > m) {
                            ar[i] = ar[i] - 1;
                            c += 1;
                            max--;
                        }

                    }
                }

                System.out.println(c);
            }
        }
        }


