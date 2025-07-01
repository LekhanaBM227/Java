import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        // Call only one function depending on the number
        if (num % 3 == 0 && num % 5 == 0) {
            isDivByThreeAndFive();
        } else if (num % 3 == 0) {
            isDivByThree();
        } else if (num % 5 == 0) {
            isDivByFive();
        } else {
            System.out.println(num);  // Optional: print the number if none match
        }
    }

    public static void isDivByThree() {
        System.out.println("Fizz");
    }

    public static void isDivByFive() {
        System.out.println("Buzz");
    }

    public static void isDivByThreeAndFive() {
        System.out.println("FizzBuzz");
    }
}

