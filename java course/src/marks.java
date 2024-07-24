import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for each subject
        System.out.println("Enter marks for Subject 1: ");
        double subject1 = scanner.nextDouble();

        System.out.println("Enter marks for Subject 2: ");
        double subject2 = scanner.nextDouble();

        System.out.println("Enter marks for Subject 3: ");
        double subject3 = scanner.nextDouble();

        System.out.println("Enter marks for Subject 4: ");
        double subject4 = scanner.nextDouble();

        System.out.println("Enter marks for Subject 5: ");
        double subject5 = scanner.nextDouble();

        // Calculate total marks and percentage
        double totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        double percentage = (totalMarks / 500) * 100;
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
}