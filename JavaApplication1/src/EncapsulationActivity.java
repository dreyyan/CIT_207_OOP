import java.util.ArrayList;

 class Student {
    // Attributes
    private int studentId;
    private String name;
    private int age;

    // Attributes: References
    private Course course;

    // Getters
    public int getStudentId() { return this.studentId; }
    public String getName() { return this.name; }
    public int getAge() { return this.age; }
    public Course getCourse() { return this.course; }  // added getter for course

    // Setters
    public void setStudentId(int studentId) { this.studentId = studentId; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setCourse(Course course) { this.course = course; }

    // Default Constructor
    Student() {}

    // Parameterized Constructor
    Student(int studentId, String name, int age, Course course) {
        this.studentId = studentId; 
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Methods
    public void setStudentInfo(int studentId, String name, int age, Course course) {
        this.studentId = studentId; 
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void displayStudentInfo() {
        System.out.println("[ STUDENT INFORMATION ]");
        System.out.println("Student ID: " + getStudentId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }

    // Main method for demonstration
    public static void main(String[] args) {
        // create courses
        Course CIT_207 = new Course(1, "CIT 207", 2);
        Course CCS_222 = new Course(2, "CCS 222", 2);
        Course SS_112 = new Course(3, "SS 112", 2);

        // create CourseManagement object
        CourseManagement cm = new CourseManagement();

        // create students
        Student Adrian = new Student();
        Adrian.setStudentInfo(101, "Adrian Dominic Tan", 20, CIT_207);
        Student John = new Student(102, "John Doe", 21, CIT_207);
        Student Jane = new Student(103, "Jane Smith", 22, CCS_222);

        // add students to CourseManagement
        cm.addStudent(Adrian);
        cm.addStudent(John);
        cm.addStudent(Jane);

        // display students by course
        cm.displayStudentsByCourse(CIT_207);
        cm.displayStudentsByCourse(CCS_222);
        cm.displayStudentsByCourse(SS_112);
    }
}

class Course {
    // Attributes
    private int courseId;
    public String courseName;
    protected int credits;

    // Parameterized Constructor
    Course(int courseId, String courseName, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
    }

    // Getters
    public int getCourseId() { return this.courseId; }
    public String getCourseName() { return this.courseName; }
    public int getCredits() { return this.credits; }

    // Methods
    public void displayCourseInfo() {
        System.out.println("[ COURSE INFORMATION ]");
        System.out.println("Course ID: " + getCourseId());
        System.out.println("Course Name: " + getCourseName());
        System.out.println("Credits: " + getCredits());
    }
}

class University {
    public static final void showUniversityName() {
        System.out.println("West Visayas State University");
    }
}

final class Department {
    public String departmentName;
    /*
    ERROR:
    ===========================================================================
    The type University cannot subclass the final class DepartmentJava(16777529)
    Department
    ===========================================================================

    COMMENT:
    ===========================================================================
    Extending the 'Department' class to other classes is not allowed in Java
    since the class was declared with a keyword 'final', signifying that any
    type of modification to the class itself is not allowed.
    ===========================================================================
    */
}

class CourseManagement {
    private ArrayList<Student> studentList = new ArrayList<>();

    // Add a student
    public void addStudent(Student s) {
        studentList.add(s);
    }

    // Display students for a specific course
    public void displayStudentsByCourse(Course course) {
        System.out.println("\nStudents enrolled in " + course.getCourseName() + ":");
        boolean found = false;
        for (Student s : studentList) {
            if (s.getCourse() == course) {
                s.displayStudentInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No students enrolled in this course.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        // create 'Course' objects and initialize
        Course CIT_207 = new Course(1, "CIT 207", 2);
        Course CCS_222 = new Course(2, "CCS 222", 2);
        Course SS_112 = new Course(3, "SS 112", 2);

        // create CourseManagement object
        CourseManagement cm = new CourseManagement();

        // create 'Student' objects and assign each to a course
        Student Adrian = new Student(101, "Adrian Dominic Tan", 20, CIT_207);
        Student John = new Student(102, "John Doe", 21, CIT_207);
        Student Jane = new Student(103, "Jane Smith", 22, CCS_222);

        // add students to CourseManagement
        cm.addStudent(Adrian);
        cm.addStudent(John);
        cm.addStudent(Jane);

        // demonstrate use of 'getters' & 'setters'
        System.out.println("Adrian's Course: " + Adrian.getCourse().getCourseName());
        System.out.println("Jane's Course: " + Jane.getCourse().getCourseName());
        Adrian.setCourse(CCS_222);
        John.setCourse(CCS_222);

        // show one-to-one and one-to-many relationships in action
        cm.displayStudentsByCourse(CIT_207);
        cm.displayStudentsByCourse(CCS_222);
        cm.displayStudentsByCourse(SS_112);
    }
}