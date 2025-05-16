import java.util.Scanner;
public class Ques2{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Menu:\n\t1. Term Deposit\n\t2. Recurring Deposit\n\nEnter your choice : ");
        int c=sc.nextInt();
        switch(c){
            case 1:
                System.out.println("Enter Principal Amount : ");
                int p=sc.nextInt();
                System.out.println("Enter Rate of interest : ");
                int r=sc.nextInt();
                System.out.println("Enter Time period (in years) : ");
                int t=sc.nextInt();
                int a=p*(1 + r/100)*t;
                System.out.println("Final Amount :"+a);
                break;
            case 2:
                System.out.println("Enter Monthly installment : ");
                int p=sc.nextInt();
                System.out.println("Enter Rate of interest : ");
                int r=sc.nextInt();
                System.out.println("Enter Time period (in months) : ");
                int t=sc.nextInt();
                int a=p*t+p*n*(n+1)/2*r/100*1/12;
                System.out.println("Maturity Amount :"+a);
                break;
            default:
                System.out.println("Enter valid choice!\n");
                break;
        }
    }
}
