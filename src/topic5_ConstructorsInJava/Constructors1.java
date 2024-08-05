package topic5_ConstructorsInJava;

public class Constructors1 {
    //Why constructors are required?
    //What is constructor?How we define it?

    int id;
    int doJ;
    String name;
    String companyName;

    public static void main(String[] args) {
        Constructors1 emp1 = new Constructors1();
        System.out.println(emp1.id);
        System.out.println(emp1.doJ);
        System.out.println(emp1.name);
        System.out.println(emp1.companyName);
        emp1.id = 12;
        emp1.doJ = 23;
        emp1.name = "Ashish";
        emp1.companyName = "Dassault";
        System.out.println(emp1.id);
        System.out.println(emp1.doJ);
        System.out.println(emp1.name);
        System.out.println(emp1.companyName);

        System.out.println("---------------------------------------------------");
        Constructors1 emp2 = new Constructors1();
        System.out.println(emp2.id);
        System.out.println(emp2.doJ);
        System.out.println(emp2.name);
        System.out.println(emp2.companyName);

        emp2.id = 10;
        emp2.doJ = 24;
        emp2.name = "Chaitanya";
        emp2.companyName = "Dassault";
        System.out.println(emp2.id);
        System.out.println(emp2.doJ);
        System.out.println(emp2.name);
        System.out.println(emp2.companyName);

        System.out.println("---------------------------------------------------");
        Constructors1 emp3 = new Constructors1();
        System.out.println(emp3.id);
        System.out.println(emp3.doJ);
        System.out.println(emp3.name);
        System.out.println(emp3.companyName);

        emp3.id = 11;
        emp3.doJ = 3;
        emp3.name = "Alok";
        emp3.companyName = "Microsoft";
        System.out.println(emp3.id);
        System.out.println(emp3.doJ);
        System.out.println(emp3.name);
        System.out.println(emp3.companyName);
    }


}
