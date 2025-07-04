package Array_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        int target = input.nextInt();

        System.out.println(Arrays.toString(TwoSumTarget(arr, target)));
    }

    public static int[] TwoSumTarget(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return arr;
    }
}
