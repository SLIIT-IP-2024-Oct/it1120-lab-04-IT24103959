
import java.util.Scanner;

public class IT24103959Lab4Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        if (number == 0) {
            System.out.println("The number is Zero");
        } else if (number > 0) {
            System.out.println("The number is Positive");
        } else if (number < 0) {
            System.out.println("The number is Negative");
        }
    }
}
