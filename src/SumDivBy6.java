import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SumDivBy6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int sum=0;
        for(int i = 1; i <= n; i++){
            int num = scanner.nextInt();
            if(num%6==0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}