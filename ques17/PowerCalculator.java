import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyCalculator calc = new MyCalculator();

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int p = scanner.nextInt();

            try {
                System.out.println(calc.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

