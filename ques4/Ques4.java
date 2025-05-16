import java.util.Scanner;

public class Ques4 {
    public static int ReplaceZero(int n) {
        String replaced = String.valueOf(n).replace('0', '1');
        return Integer.parseInt(replaced);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Updated Number: " + ReplaceZero(n));
    }
}

