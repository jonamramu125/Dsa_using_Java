import java.util.Scanner;
public class Simple_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal:");
        double p = input.nextDouble();
        System.out.println("Enter the time in years:");
        int t = input.nextInt();
        System.out.println("Enter the rate of interest:");
        double r = input.nextDouble();
        double Simple_interest = p * t * r /100;
        System.out.println("The Simple Interest is :"+ Simple_interest);
        input.close();
    }
}
