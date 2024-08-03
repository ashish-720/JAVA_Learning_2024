package methodsInJava;

public class EmployeeTemplate {

    String employeeName;
    String employeeId;


    public static void main(String[] args) {
        EmployeeTemplate emp1 = new EmployeeTemplate();
        System.out.println(emp1.employeeName);
        System.out.println(emp1.employeeId);
        System.out.println("--------------------------------------------------");
        emp1.setEmployeeDetails("Ashish", "00057499");
        System.out.println(emp1.employeeName);
        System.out.println(emp1.employeeId);
        System.out.println("--------------------------------------------------");
        EmployeeTemplate emp2 = new EmployeeTemplate();
        System.out.println(emp2.employeeName);
        System.out.println(emp2.employeeId);
        System.out.println("--------------------------------------------------");
        emp2.setEmployeeDetails("Chaitanya", "555777");
        System.out.println(emp2.employeeName);
        System.out.println(emp2.employeeId);

        System.out.println("--------------------------------------------------");
        EmployeeTemplate emp3 = new EmployeeTemplate();
        System.out.println(emp3.employeeName);
        System.out.println(emp3.employeeId);
        System.out.println("--------------------------------------------------");
        emp3.employeeName = "Alok";
        emp3.employeeId = "3335555";
        System.out.println(emp3.employeeName);
        System.out.println(emp3.employeeId);
    }

//    public void setEmployeeDetails(String a, String b) {
//        employeeName = a;
//        employeeId = b;
//    }

    public void setEmployeeDetails(String employeeName, String employeeId) {
        //this keyword
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

}
