package Arrays_Basic;

import java.util.Arrays;

import static Arrays_Basic.SwapEleInArray.swap;

public class MaxItemInArray {
    public static void main(String[] args) {
        int arr[] = {1, 3, 23, 9, 18};
        System.out.println(maxRange(arr,1,3));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Work on edge cases here,like array being null
    public static int maxRange(int[] arr, int start, int end) {

        if(start>end){
            return -1;
        }
        if(arr==null||arr.length==0){
            return -1;
        }
        int max = arr[start];
        for(int i=start;i<=end;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
//    public static int maxRange(int[] arr,int start,int end){
//        int max = arr[start];
//        for(int i=start;i<=end;i++){
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//        return max;
//    }

    public static int max(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }

    }
}
