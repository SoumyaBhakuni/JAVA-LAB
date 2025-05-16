import java.util.Scanner;

public class Ques3 {
    public static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum + sum;
    }                                                                     
    
    public static boolean areFriendlyPairs(int num1, int num2) {
        int sum1=sumOfDivisors(num1);
        int sum2=sumOfDivisors(num2);
        return (sum1/(double)num1)==(sum2/(double)num2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        if(sumOfDivisors(num1) == num1 && sumOfDivisors(num2) == num2){
            System.out.println("Abundant Numbers");
        }
        else if (areFriendlyPairs(num1, num2)) {
             System.out.println("Friendly Pair");
        }
        else {
            System.out.println("Not Friendly Pair");
        }
        scanner.close();
    }
}

