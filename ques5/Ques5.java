import java.util.Arrays;

public class Ques5 {
    public static void sortZigzag(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i += 2) {
            if (i - 1 >= 0 && arr[i] < arr[i - 1]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
            if (i + 1 < arr.length && arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 7, 8, 6, 2, 1 };
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        sortZigzag(arr);
        
        System.out.println("Zigzag Sorted Array: " + Arrays.toString(arr));
    }
}

