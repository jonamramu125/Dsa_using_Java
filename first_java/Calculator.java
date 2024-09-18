import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1:");
        double num1 = input.nextDouble();
        System.out.println("Enter num2:");
        double num2 = input.nextDouble();
        System.out.println("Choose the operator to perform the operation.The operators are ' +  -  * /'");
        char operator = input.next().charAt(0);
        double result = 0;
        switch(operator){
            case '+':
            result = num1+num2;
            break;
            case '-':
            result = num1 - num2;
            break;
            case '*':
            result = num1 * num2;
            break;
            case '/':
            if (num2!=0){
                result = num1/num2;
            }else{
                System.out.println("The Divisor can't be a zero");
            }
            break;
            default:
            System.out.println("Invalid operator");

        }
        System.out.println("The result is:"+result);
        input.close();
    }
}
