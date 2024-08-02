package topic4_classAndObjects;

public class Employee {

    String name;
    String employeeId;
    int yearOfExperience;

    static String companyName = "Dassault";

    public static void joiningProcessOfAnEmployee() {
        System.out.println("Employee Joining Process");
    }

    public void displayEmployeeData() {
        System.out.println(name);
        System.out.println(employeeId);
        System.out.println(yearOfExperience);
        System.out.println(companyName);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Ashish";
        emp1.employeeId = "00057499";
        emp1.yearOfExperience = 5;
        emp1.displayEmployeeData();

        System.out.println("---------------------------------------------------------");
        Employee emp2 = new Employee();
        emp2.name = "Chaitanya";
        emp2.employeeId = "00057498";
        emp2.yearOfExperience = 2;
        emp2.displayEmployeeData();

        System.out.println("Dassault shuts down and all the employees moves to Microsoft");

        companyName = "Microsoft";
        System.out.println("---------------------------------------------------------");
        System.out.println(companyName);
        System.out.println(Employee.companyName);
        System.out.println(emp1.companyName);
    }

}
