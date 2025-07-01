import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n!=0){
            n++;
            double sqrt = Math.sqrt(n);
            if(sqrt == (int)sqrt){
                System.out.println(n);
                break;
            }
        }

        sc.close();
    }
}
