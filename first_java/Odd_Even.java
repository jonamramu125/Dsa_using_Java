import java.util.Scanner;

public class Odd_Even{
    public static void main(String[] args) {
        int userInput;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        userInput = input.nextInt();
        if(userInput % 2 == 0){
            System.out.println("The given input is Even");
        }else{
            System.out.println("The given input is Odd");
        }
        input.close();
        
    }
}