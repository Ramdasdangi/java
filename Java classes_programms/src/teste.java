import java.util.Scanner;

public class teste {

    // Method to reverse number
    static int reverse(int n) {
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        return rev;
    }

    // Method to check palindrome
    static boolean isPalindrome(int n) {
        return n == reverse(n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three digit number: ");
        int num = sc.nextInt();

        while (!isPalindrome(num)) {

            int rev = reverse(num);

            System.out.println(num + " + " + rev + " = " + (num + rev));

            num = num + rev;
        }

        System.out.println("Palindrome Number = " + num);
    }
}
