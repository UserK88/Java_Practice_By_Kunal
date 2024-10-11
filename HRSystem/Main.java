package HRSystem;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Hulk", "Hogan", 101, 30, 2500,10, 200000.0, 6);
        System.out.println("The object of employee "+e1.firstName+" "+e1.lastName+" is created.");
        System.out.println("Name: "+e1.firstName+" "+e1.lastName);
        System.out.println("Registration number: "+e1.registration);
        System.out.println("Age: "+e1.age);
        System.out.println("Salary "+e1.salary);
        System.out.println("Years Worked: "+e1.yearsWorked);
        System.out.println("The time to retirement of "+e1.firstName+" "+e1.lastName+" is: "+e1.timeToRetirement());

        SalesRep s1 = new SalesRep("Alex", "McMahon", 101, 32, 730, 10, 30000, 6, 100000);
        System.out.println("The object of Sales Representative "+s1.firstName+" "+s1.lastName+" is created.");
        System.out.println("Name: "+s1.firstName+" "+s1.lastName);
        System.out.println("Registration number: "+s1.registration);
        System.out.println("Age: "+s1.age);
        System.out.println("Salary "+s1.salary);
        System.out.println("Years Worked: "+s1.yearsWorked);

        SalesRep s2 = new SalesRep("John", "Cena", 102, 32, 730, 10, 30000, 6, 200000);
        System.out.println("The object of Sales Representative "+s2.firstName+" "+s2.lastName+" is created.");
        System.out.println("Name: "+s2.firstName+" "+s2.lastName);
        System.out.println("Registration number: "+s2.registration);
        System.out.println("Age: "+s2.age);
        System.out.println("Salary "+s2.salary);
        System.out.println("Years Worked: "+s2.yearsWorked);
        
        SalesRep s3 = new SalesRep("James", "Pitt", 103, 32, 730, 10, 30000, 6, 150000);
        System.out.println("The object of Sales Representative "+s3.firstName+" "+s3.lastName+" is created.");
        System.out.println("Name: "+s3.firstName+" "+s3.lastName);
        System.out.println("Registration number: "+s3.registration);
        System.out.println("Age: "+s3.age);
        System.out.println("Salary "+s3.salary);
        System.out.println("Years Worked: "+s3.yearsWorked);


        System.out.println("The commission of Sales Representative "+s1.firstName+" "+s1.lastName+" is "+s1.calculateCommission());
        System.out.println("The commission of Sales Representative "+s2.firstName+" "+s2.lastName+" is "+s2.calculateCommission());
        System.out.println("The commission of Sales Representative "+s3.firstName+" "+s3.lastName+" is "+s3.calculateCommission());

        SalesManager SM = new SalesManager("Brad", "Pitt", 104, 33, 730, 10, 50000, 6, 120000, s1.salary+s2.salesMade+s3.salesMade);

        SM.commission();

        // System.out.println("Commission of sales manager "+SM.firstName+" "+SM.lastName+" is "+SM;

    }
}
