import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int userInput = scanner.nextInt();

        userInput *= userInput;
        System.out.println(userInput);

    }
}
