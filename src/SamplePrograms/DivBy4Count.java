package SamplePrograms;

import java.util.Scanner;

public class DivBy4Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int max = 0;
        while(n>0){
            int num = sc.nextInt();
            if(num%4==0){
                if(num>max){
                    max = num;
                }
            }
            n--;
        }
        System.out.println(max);
    }
}
