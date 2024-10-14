package HRSystem;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Hulk", "Hogan", 101, 30, 2500,10, 200000.0, 6);
        
        System.out.println("The time to retirement of "+e1.firstName+" "+e1.lastName+" is: "+e1.timeToRetirement());
        System.out.println("Vacation time left: "+e1.vacationTimeLeft());
        System.out.println(e1.calculateBonus());

        SalesRep s1 = new SalesRep("Alex", "McMahon", 101, 32, 730, 10, 30000, 6, 100000);
        s1.printDetails();

        SalesRep s2 = new SalesRep("John", "Cena", 102, 32, 730, 10, 30000, 6, 200000);
        s2.printDetails();
        
        SalesRep s3 = new SalesRep("James", "Pitt", 103, 32, 730, 10, 30000, 6, 150000);
        s3.printDetails();


        System.out.println();
        System.out.println("The commission of Sales Representative "+s1.firstName+" "+s1.lastName+" is "+s1.calculateCommission());
        System.out.println("The commission of Sales Representative "+s2.firstName+" "+s2.lastName+" is "+s2.calculateCommission());
        System.out.println("The commission of Sales Representative "+s3.firstName+" "+s3.lastName+" is "+s3.calculateCommission());

        SalesManager SM = new SalesManager("Brad", "Pitt", 104, 33, 730, 10, 50000, 6, 120000, s1.salary+s2.salesMade+s3.salesMade);

        SM.commission();
    }
}
