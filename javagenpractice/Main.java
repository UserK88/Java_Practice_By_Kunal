package javagenpractice;

public class Main {
    public static void main(String[] args) {
        // Create some students
        Student s1 = new Student("John", "Doe", 101, 75, 2);
        Student s2 = new Student("Jane", "Smith", 102, 58, 1);
        Student s3 = new Student("Alice", "Johnson", 103, 85, 3);

        // Print full names
        s1.printFullName(); // John Doe
        s2.printFullName(); // Jane Smith

        // Check if students are approved
        System.out.println(s1.isApproved()); // true
        System.out.println(s2.isApproved()); // false

        // Change year if approved
        s1.changeYearIfApproved(); // Congratulations!
        s2.changeYearIfApproved(); // You did not pass the year.

        // Create a course and enroll students
        Courses course = new Courses("Math 101", "Professor X", 2024);
        course.enroll(s1);
        course.enroll(s2);
        course.enroll(s3);

        // Count students
        System.out.println("Number of students: " + course.countStudents()); // 3

        // Find the best grade
        System.out.println("Best grade: " + course.bestGrade()); // 85

        // Overload: Enroll multiple students
        Student[] newStudents = {new Student("Chris", "Evans", 104, 90, 2), new Student("Emily", "Blunt", 105, 70, 1)};
        course.enroll(newStudents);

        // Count students again
        System.out.println("Number of students after enrolling more: " + course.countStudents()); // 5
    }
}

