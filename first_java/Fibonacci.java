import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to generate fibonacci series:");
        int num = input.nextInt();
        int first = 0, second =1;
        System.out.print("The Fibonnaci series : "+ first + " " + second);
        for(int i =2; i<=num; i++){
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second =next;
        }
        input.close();

    }
}
