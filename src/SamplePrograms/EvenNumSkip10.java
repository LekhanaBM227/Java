import java.util.Scanner;

public class EvenNumSkip10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the integer 'n' as input from user
        int n = sc.nextInt();

        // Loop from 1 to 'n' to print the numbers
        for(int i = 1; i <= n; i++) {
            // Include condition to check if 'i' is even
            // If 'i' is 10, skip this number and the next five numbers
            if(i%2==0) {
                if(i>=10 && i<=15) {
                    continue;
                }
                System.out.print(i+" ");
            }
        }

        sc.close();
    }
}
