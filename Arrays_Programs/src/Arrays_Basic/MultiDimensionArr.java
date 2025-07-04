package Arrays_Basic;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] arr2d = {
                {1,2,3,6},
                {4,5,6},
                {7,8,9,7,9,2}
        }; // array of arrays
        System.out.println(arr2d[1][2]);

        int [][] arr = new int[3][3]; //No. of rows is mandatory
        for (int i = 0; i < arr.length; i++) { // row
            for (int j = 0; j < arr[i].length; j++) { //col
                arr[i][j] = sc.nextInt();
            }
        }
//        for (int i = 0; i < arr.length; i++) { // row
//            for (int j = 0; j < arr[i].length; j++) { //col
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        // Or
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i])); //Array list will be printed
//        }

        // Or
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
