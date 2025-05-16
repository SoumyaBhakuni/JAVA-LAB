import java.util.*;

public class ArrayDemo {
    void arrayFunction(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    System.out.println(arr[i] + "+" + arr[j] + "=" + k);
                }
            }
        }
    }

    void arrayFunction(int[] A, int p, int[] B, int q) {
        int[] merged = new int[p + q];
        for (int i = 0; i < p; i++) merged[i] = A[i];
        for (int i = 0; i < q; i++) merged[p + i] = B[i];

        Arrays.sort(merged);

        for (int i = 0; i < p; i++) A[i] = merged[i];
        for (int i = 0; i < q; i++) B[i] = merged[p + i];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDemo obj = new ArrayDemo();

        int p = 6, q = 3, target = 10;
        int[] A = {1, 5, 6, 7, 8, 10};
        int[] B = {2, 4, 9};
        int[] arr = {4, 6, 5, -10, 8, 5, 20};

        obj.arrayFunction(arr, target);
        obj.arrayFunction(A, p, B, q);

        System.out.println("Array A: " + Arrays.toString(A));
        System.out.println("Array B: " + Arrays.toString(B));
    }
}

