package Arrays_Basic;

public class ColNumFixed {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
