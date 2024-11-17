
import java.util.Scanner;

public class IT24103959Lab4Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double examMarks, labMarks, examPercentage, labPercentage, totalMarks;

        System.out.print("Please enter exam marks (out of 100)");
        examMarks = scanner.nextDouble();
        if (examMarks > 100 || examMarks < 0) {
            System.out.print("Invalid input for exam marks. Terminating program");
            return;
        }

        System.out.print("Please enter lab marks (out of 100)");
        labMarks = scanner.nextDouble();
        if (labMarks > 100 || labMarks < 0) {
            System.out.print("Invalid input for lab marks. Terminating program");
            return;
        }

        System.out.print("Please enter the percentage given for the exam: ");
        examPercentage = scanner.nextDouble();
        System.out.print("Please enter the percentage given for the lab: ");
        labPercentage = scanner.nextDouble();

        if (examPercentage + labPercentage != 100) {
            System.out.print("The percentages must add up to 100. Terminating program");
            return;
        }

        totalMarks = examMarks * (examPercentage * 0.01) + labMarks * (labPercentage * 0.01);

        System.out.println("Final Exam mark is: " + totalMarks);

    }
}
