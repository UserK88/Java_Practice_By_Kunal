package HRSystem;

public class Employee {
    String firstName;
    String lastName;
    int registration;
    int age;
    int daysWorked;
    int vacationDaysTaken;
    double salary;
    int yearsWorked;

    public Employee(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
            double salary, int yearsWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.age = age;
        this.daysWorked = daysWorked;
        this.vacationDaysTaken = vacationDaysTaken;
        this.salary = salary;
        this.yearsWorked = yearsWorked;
    }

    public int timeToRetirement(){
        return Math.min(60-age, 40-yearsWorked);
    }
    public int vacationTimeLeft(){
        return (daysWorked/360)*(30-vacationDaysTaken);
    }
    public int calculateBonus(){
        double bonus = 2.2*salary;
        return (int) bonus;    // This is a shortcut for returning typecatsed value

        // int b = (int) bonus;
        // return b;                While This will also work the same
    }

    public void printDetails(){
        System.out.println("\nDetails of employee: ");
        System.out.println("Name: "+firstName+" "+lastName);
        System.out.println("Registration No.: "+registration);
        System.out.println("Age: "+firstName+" "+age);
        System.out.println("Days Worked: "+daysWorked);
        System.out.println("Vacation Days Taken: "+vacationDaysTaken);
        System.out.println("Salary: "+salary);
        System.out.println("Years Worked: "+yearsWorked);
    }



}

