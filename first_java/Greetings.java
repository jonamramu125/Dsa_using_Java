import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the name:");
        String name = input.nextLine();
        System.out.println("Hello motherFucker "+ name);
        input.close();
    }
}

