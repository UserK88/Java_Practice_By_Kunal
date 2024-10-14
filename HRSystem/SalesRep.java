package HRSystem;

public class SalesRep extends Employee {

    double salesMade;
    public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
            double salary, int yearsWorked, double salesMade) {
        super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
        this.salesMade = salesMade;
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

    public int calculateCommission(){
        double commission = 0.1*salesMade;
        return (int) commission;
    }
    
}
