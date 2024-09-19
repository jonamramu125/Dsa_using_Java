import java.util.Scanner;
public class Armstrong{
    public static boolean isArmstrong(int number){
        int num = number;
        int sum =0, n = String.valueOf(number).length();
        while(number>0){
            int digits = number %10;
            sum += Math.pow(digits,n);
            number /=10;
        }
        return sum == num;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lower and upper limit to check the armstrong number between them:");
        int lower = input.nextInt();
        int upper = input.nextInt();
        System.out.print("The armstrong numbers are between :"+ lower + " and " + upper + "are: ");
        for(int i = lower; i<=upper;i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
        input.close();
    }
}