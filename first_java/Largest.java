import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    System.out.println("Enter num1:");
    double num1 = input.nextDouble();
    System.out.println("Enter num2:");
    double num2 = input.nextDouble();
    if(num1 == num2){
        System.out.println("Both numbers are Equal");
    }else if(num1>num2){
        System.out.println("num1 is greater than num2");
    }else{
        System.out.println("num2 is greater than num1");
    }
    input.close();
}
}
