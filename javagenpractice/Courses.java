package javagenpractice;

import java.util.ArrayList;

public class Courses {
    String courseName;
    String professorName;
    int year;
    ArrayList<Student> students;

    // Constructor
    public Courses(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        this.students = new ArrayList<>();
    }

    // Enroll a single student
    public void enroll(Student student) {
        students.add(student);
    }

    // Unenroll a student
    public void unEnroll(Student student) {
        students.removeIf(s -> s.registration == student.registration);
    }

    // Count the number of students
    public int countStudents() {
        return students.size();
    }

    // Find the best grade
    public int bestGrade() {
        int maxGrade = 0;
        for (Student student : students) {
            if (student.grade > maxGrade) {
                maxGrade = student.grade;
            }
        }
        return maxGrade;
    }

    // Overload the enroll method to accept an array of students
    public void enroll(Student[] studentsArray) {
        for (Student student : studentsArray) {
            enroll(student); // Call the single enroll method for each student
        }
    }
}
