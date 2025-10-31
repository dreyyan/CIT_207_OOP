// Superclass
class Person {
    // Method/s
    public void displayRole() {
        System.out.println("General person role.");
    }
}

// Subclass: Teacher < Person
class Teacher extends Person {
    @Override
    public void displayRole() {
        System.out.println("I am a Teacher.");
    }
}

// Subclass: Student < Person
class Student extends Person {
    @Override
    public void displayRole() {
        System.out.println("I am a Student.");
    }
}

// Subclass: Registrar < Person
class Registrar extends Person {
    @Override
    public void displayRole() {
        System.out.println("I am the Registrar.");
    }
}

// Class: ReportCard
class ReportCard {
    // Overloaded Methods
    public void generateReport(String studentName, double gpa) {
        System.out.println("Report for " + studentName + ": GPA = " + gpa);
    }

    public void generateReport(String studentName, double gpa, String remarks) {
        System.out.println("Report for " + studentName + ": GPA = " + gpa + " | Remarks: " + remarks);
    }
}

public class Main {
    public static void main(String[] args) {
        // Runtime Polymorphism
        Person person;

        person = new Teacher();
        person.displayRole();

        person = new Student();
        person.displayRole();

        person = new Registrar();
        person.displayRole();

        // ReportCard Overloading
        ReportCard report = new ReportCard();
        report.generateReport("Juan Dela Cruz", 1.75);
        report.generateReport("Ana Santos", 1.25, "With Honors");
    }
}
