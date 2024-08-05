package topic5_ConstructorsInJava;

public class Employee {
    //Name of constructor is equal to class name
    //Constructor looks like method
    //constructor doesn't have return type
    //Access modifier can be there or cannont be there
    //<Access modifier> <ClassName>(){
    // }
    int id;
    int doJ;
    String name;
    String companyName;

    //Zero parameterized constructor /zero argument constructor
    public Employee() {
        id = 12;
        doJ = 23;
        name = "Ashish";
        companyName = "Dassault";
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        System.out.println(emp1.id);
        System.out.println(emp1.doJ);
        System.out.println(emp1.name);
        System.out.println(emp1.companyName);

        System.out.println("-------------------------");
        Employee emp2 = new Employee();
        System.out.println(emp2.id);
        System.out.println(emp2.doJ);
        System.out.println(emp2.name);
        System.out.println(emp2.companyName);
        emp2.id = 13;
        emp2.name = "Alok";
        emp2.companyName = "MicroSoft";
        emp2.doJ = 11;
        System.out.println("-------------------------");
        System.out.println(emp2.id);
        System.out.println(emp2.doJ);
        System.out.println(emp2.name);
        System.out.println(emp2.companyName);

    }
}
