import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentInfo {
    static Scanner scanner = new Scanner(System.in);
    // ATTRIBUTES
    String name;
    int age;
    int grade;
    boolean isEnrolled;

    // Getters
    public String getName() { return this.name; }
    public int getAge() { return this.age; }
    public int getGrade() { return this.grade; }
    public boolean getEnrollmentStatus() { return this.isEnrolled; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setGrade(int grade) { this.grade = grade; }
    public void setEnrollmentStatus(boolean isEnrolled) { this.isEnrolled = isEnrolled; }

    // UTILITY
    public static void errorMessage(String message) { System.out.println("ERROR: " + message); }

    // METHODS
    public void promptName() {
        String userInput = "";

        while (true) {
            System.out.print("Enter Name: ");
            userInput = scanner.nextLine();

            if (userInput.isEmpty()) errorMessage("Name must not be blank");
            else break;
        }

        this.setName(userInput);
    }

    public void promptAge() {
        int userInput = -1;

        while (true) {
            try {
                System.out.print("Enter Age: ");
                userInput = scanner.nextInt();
                scanner.nextLine();

                if (userInput <= 0) errorMessage("Invalid input, age cannot be negative");
                else break;
            } catch (InputMismatchException e) {
                errorMessage("Invalid input, please enter a valid number");
            }
        }

        setAge(userInput);
    }

    public void promptGrade() {
        float gwa = -1;
        int convertedPercentage = 0;

        while (true) {
            try {
                System.out.print("Enter GWA (1.00, 1.25, ..., 3.00, 5.00): ");
                gwa = scanner.nextFloat();
                scanner.nextLine();

                // validate GWA values
                if (gwa == 1.00f || gwa == 1.25f || gwa == 1.50f || gwa == 1.75f ||
                    gwa == 2.00f || gwa == 2.25f || gwa == 2.50f || gwa == 2.75f ||
                    gwa == 3.00f || gwa == 5.00f) {
                    break;
                } else {
                    errorMessage("Invalid input, please enter a valid GWA (1.00–3.00 or 5.00).");
                }
            } catch (InputMismatchException e) {
                errorMessage("Invalid input, please enter a decimal number (e.g., 1.25).");
                scanner.nextLine();
            }
        }

        // Convert GWA to percentage
        if (gwa == 1.00f) convertedPercentage = 99;
        else if (gwa == 1.25f) convertedPercentage = 96;
        else if (gwa == 1.50f) convertedPercentage = 93;
        else if (gwa == 1.75f) convertedPercentage = 90;
        else if (gwa == 2.00f) convertedPercentage = 87;
        else if (gwa == 2.25f) convertedPercentage = 84;
        else if (gwa == 2.50f) convertedPercentage = 81;
        else if (gwa == 2.75f) convertedPercentage = 78;
        else if (gwa == 3.00f) convertedPercentage = 75;
        else if (gwa == 5.00f) convertedPercentage = 65;

        setGrade(convertedPercentage);
    }


    public void promptIsEnrolled() {
        String input;
        char userInput;

        while (true) {
            System.out.print("Are you enrolled? [y/n]: ");
            input = scanner.nextLine();

            if (input.isEmpty()) { errorMessage("Invalid input, enrollemnt status cannot be empty"); }
            userInput = Character.toLowerCase(input.charAt(0));

            if (userInput != 'y' && userInput != 'n') errorMessage("Invalid input, please enter 'y' for yes and 'n' for no");
            else break;
        }

        setEnrollmentStatus((userInput == 'y' ? true : false));
    }

    public void displayStudentInformation() {
        System.out.println("[ STUDENT INFORMATION ]");
        System.out.printf("    Name: %s\n", getName());
        System.out.printf("     Age: %d\n", getAge());
        System.out.printf("   Grade: %d%%\n", getGrade());
        System.out.println("Enrolled: " + (getEnrollmentStatus() ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        StudentInfo Adrian = new StudentInfo();
        Adrian.promptName();
        Adrian.promptAge();
        Adrian.promptGrade();
        Adrian.promptIsEnrolled();
        Adrian.displayStudentInformation();
    }
}