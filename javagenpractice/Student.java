package javagenpractice;
public class Student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    
    public void printFullName(){
        System.out.println(firstName+" "+lastName);
    }
    public boolean isApproved(){
        if(grade>=60){
            return true;
        }
        return false;
    }
    public int changeYearIfApproved(){
        if(grade>=60){
            year = year+1;
            System.out.println("Congratulations, you have been approved to the next year");
        }
        return 0;
    }
    public Student(String firstName, String lastName, int registration, int grade, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }

    public Student(String firstName, String lastName, int registration) {
        this(firstName, lastName, registration, 0, 1); // Default grade=0, year=1
    }
    
    public Student(String firstName, String lastName) {
        this(firstName, lastName, 0, 0, 1); // Default registration=0, grade=0, year=1
    }
}


