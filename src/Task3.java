import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));
        System.out.println("min:" + min(arr) + "\n" + "max:" + max(arr));
    }


    public static int min(int[] arr) {
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }

        }
        return min;
    }

    public static int max(int[] arr) {
        int max = 0;

        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}