//Made by Prateek Kumar for Codesoft internship

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numSubjects = 5;
        int totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter the score for Subject " + i + " (out of 100): ");
            int score = scanner.nextInt();


            if (score < 0 || score > 100) {
                System.out.println("Invalid score. Please enter a score between 0 and 100.");
                i--;
            } else {
                totalMarks += score;
            }
        }

        double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;

        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Made by Prateek kumar for CODESOFT internship");

        scanner.close();
    }
}
