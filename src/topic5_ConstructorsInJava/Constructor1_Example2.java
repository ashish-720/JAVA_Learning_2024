package topic5_ConstructorsInJava;

public class Constructor1_Example2 {
    int id = 20;
    int doJ = 5;
    String name = "Ram";
    String companyName = "Google";

    public static void main(String[] args) {
        Constructor1_Example2 emp1 = new Constructor1_Example2();
        System.out.println(emp1.id);
        System.out.println(emp1.name);
        System.out.println(emp1.doJ);
        System.out.println(emp1.companyName);
        System.out.println("---------------------------");
        Constructor1_Example2 emp2 = new Constructor1_Example2();
        System.out.println(emp2.id);
        System.out.println(emp2.name);
        System.out.println(emp2.doJ);
        System.out.println(emp2.companyName);
        emp2.id = 23; // In this way we can intitialize the non static variables but the problem is it is only applicable for this object
        emp2.name = "Sham";
        emp2.doJ = 30;
        emp2.companyName = "Microsoft";
        System.out.println("---------------------------");
        System.out.println(emp2.id);
        System.out.println(emp2.name);
        System.out.println(emp2.doJ);
        System.out.println(emp2.companyName);

        Constructor1_Example2 emp3=new Constructor1_Example2();
        System.out.println(emp3.id);
        System.out.println(emp3.name);
        System.out.println(emp3.doJ);
        System.out.println(emp3.companyName);

    }


}
