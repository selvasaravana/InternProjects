import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks obtained (out of 100) in each subject:");

        int subjects = 0;
        int totalMarks = 0;

        while (true) {
            System.out.print("Enter marks for subject " + (subjects + 1) + " (or -1 to finish): ");
            int marks = scanner.nextInt();

            if (marks == -1) {
                break;
            }

            if (marks >= 0 && marks <= 100) {
                totalMarks += marks;
                subjects++;
            } else {
                System.out.println("Invalid input! Marks should be between 0 and 100.");
            }
        }

        if (subjects > 0) {
            double averagePercentage = (double) totalMarks / subjects;
            String grade = calculateGrade(averagePercentage);

            System.out.println("\nResults:");
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + averagePercentage + "%");
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("No valid subjects entered. Exiting.");
        }

        scanner.close();
    }

    private static String calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A";
        } else if (averagePercentage >= 80) {
            return "B";
        } else if (averagePercentage >= 70) {
            return "C";
        } else if (averagePercentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
