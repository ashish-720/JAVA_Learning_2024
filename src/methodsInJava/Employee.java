package methodsInJava;

public class Employee {
    //Accessibility

    static String companyName = "Google";


    public static void main(String[] args) {
        String name = "Ashish";
        System.out.println(name); //o/p Ashish
        System.out.println(companyName);  // o/p Google
        System.out.println(Employee.companyName);  //O/p Google
        System.out.println("-----------------------------------------------------------------------------");
        String companyName = "Micro Focus";
        System.out.println(companyName); // O/p Micro Focus
        System.out.println("--------------------------------------------------------------------");
        System.out.println(Employee.companyName); //o/p Google
        System.out.println("--------------------------------------------------------------------");
        work();
        System.out.println("--------------------------------------------------------------------");
        work("Chaitanya", "Microsoft");
    }

    public static void work() {
        String name = "Chaitanya";
        System.out.println(name); // O/p Chaitanya
        System.out.println(companyName);  //Google
    }

    public static void work(String name, String companyName) {
        System.out.println(name); //Chaitanya
        System.out.println(companyName); //Microsoft
        System.out.println(Employee.companyName); //Google
    }

}
