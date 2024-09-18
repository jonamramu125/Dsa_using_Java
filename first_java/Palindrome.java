import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the string to check palindrome or not");
        String pali = input.nextLine().toLowerCase();
        boolean isPalindrome = true;
        for(int i =0; i<pali.length();i++){
            if(pali.charAt(i) != pali.charAt(pali.length() - i -1) ){
                isPalindrome =false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("The Entereed string is palindrome");
        }else{
            System.out.println("Entered string is not a palindrome");
        }
        input.close();
    }
}