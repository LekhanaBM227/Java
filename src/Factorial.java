import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // 3.2 Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // TODO: 1. Ask user for an integer 'n' using scanner.nextInt()
        int n = scanner.nextInt();
        if (n == 0){
            System.out.println(1);
        }
        else {
            // TODO: 2. Print the factorial of 'n'
            int fact = 1;
            while (n>0){
                fact *= n;
                n--;
            }
            System.out.println(fact);
        }

        scanner.close(); // Always close the scanner when done
    }
}
