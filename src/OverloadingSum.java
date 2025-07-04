import java.util.Scanner;

public class OverloadingSum {

    public static void sum(int a,int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public static void sum(int a,int b,int c){
        int sum = (a+b)*c;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        sum(num1,num2);
        sum(num1,num2,num3);
    }
}
