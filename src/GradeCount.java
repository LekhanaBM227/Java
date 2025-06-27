import java.util.Scanner;

public class GradeCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int D_count = 0;
        int C_count = 0;
        int B_count = 0;
        int A_count = 0;
        int others_cnt = 0;

        for(int i = 1; i <= n; i++){
            char grade = sc.next().charAt(0);
            if(grade=='D'){
                D_count++;
            }
            if(grade=='C'){
                C_count++;
            }
            if(grade=='B'){
                B_count++;
            }
            if(grade=='A') {
                A_count++;
            }
            else{
                others_cnt++;
            }
        }
        System.out.println((D_count+" "+C_count+" "+B_count+" "+A_count+" "+others_cnt));
    }
}
