package HRSystem;


public class SalesManager extends SalesRep {

    double salesByTeam;

    public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked,
            int vacationDaysTaken, double salary, int yearsWorked, double salesMade, double salesByTeam) {
        super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, salesMade);
        this.salesByTeam = salesByTeam;
    }

    public void commission(){
        System.out.println("The commission of Sales Manager "+firstName+" "+lastName+" is "+(0.03*salesByTeam));
    }


    // HashMap <Integer, SalesRep> salesTeam = new HashMap<Integer, SalesRep>();
    
    // public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken, double salary, int yearsWorked){
    //     super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
    // }
    
}
