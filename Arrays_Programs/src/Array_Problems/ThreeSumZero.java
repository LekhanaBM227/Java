package Array_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeSumZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(TwoSumTarget(arr)));
    }

    public static int[] TwoSumTarget(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length+1; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        return new int[]{arr[i], arr[j], arr[k]};
                    }
                }
            }
            return arr;
        }
        return arr;
    }
}
