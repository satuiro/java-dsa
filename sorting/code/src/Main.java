import java.lang.reflect.Array;
import java.util.Arrays;


public class Main {
    public static <String> void main(String[] args) {
        int[] arr = {4,3,5,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
        }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMax(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMax(int[] arr, int start, int last) {
        int max = start;

        for (int i = 0; i < arr.length; i++) {
            if (arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void bubble(int[] arr){
        // run the steps n-1 times
        boolean swapped;
        for (int i = 0; i < arr.length ; i++) {
            swapped = false;
            // for each step max item comes at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you don't swap for a particular value that is the array is sorted hence stop the loop
            if (!swapped){
                break;
            }
        }
    }
}

