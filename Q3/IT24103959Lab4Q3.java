
import java.util.Scanner;

public class IT24103959Lab4Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        System.out.println(number == 0 ? "The number is Zero" : number > 0 ? "The number is Positive" : "The number is Negative");
    }
}
