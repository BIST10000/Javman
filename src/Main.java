import java.lang.reflect.Array;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] arr1 = {-1, 2, 3, -50, 8};
        ArrayHelper.positiveNum(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(ArrayHelper.summa(arr1));
        arr1 = ArrayHelper.addToEnd(arr1,5);
        arr1 = ArrayHelper.addToIndex(arr1, 4, 999);
        System.out.println(Arrays.toString(arr1));
    }
}