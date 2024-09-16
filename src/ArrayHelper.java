import java.util.Arrays;

public class ArrayHelper {
    public static int summa(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void positiveNum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
    }

    public static void addToEnd(int[] arr, int num) {
        int[] arr2 = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr2[arr2.length - 1] = num;
        System.out.println(Arrays.toString(arr2));
    }

    public static void addToIndex(int[] arr, int indx, int num) {
        int[] arr2 = new int[arr.length + 1];
        for (int i = 0; i < indx; i++) {
            arr2[i] = arr[i];
        }
        arr2[indx] = num;
        for (int i = indx + 1; i < arr2.length; i++) {
            arr2[i] = arr[i - 1];
        }
        System.out.println(Arrays.toString(arr2));
    }


}
