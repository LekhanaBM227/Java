import java.util.Scanner;

public class MaxNumSeqEndBy0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int num;
        do {
            num = sc.nextInt();
            if (num > max) {
                max = num;
            }
        } while (num != 0);
        System.out.println(max);
    }
}
