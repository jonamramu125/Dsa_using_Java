import java.util.Scanner;
public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the currency in rupees:");
        double rupees = input.nextDouble();
        double usd = rupees * 0.012;
        System.out.println("The Conversion of " + rupees + " rupees is " + usd +" USD");
        input.close();
    }
}
