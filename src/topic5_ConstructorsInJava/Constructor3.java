package topic5_ConstructorsInJava;

public class Constructor3 {
    //parameterized Constructors or Contructors with arguments
    //If we want to create the objects with Different values ie to over come the limitation of Zero parameterized Constructor we go for it

    int id;
    int doJ;
    String name;
    String companyName;

    public Constructor3(int id, int doJ, String name, String companyName) {
        this.id = id;
        this.doJ = doJ;
        this.name = name;
        this.companyName = companyName;
    }

    public static void main(String[] args) {
        Constructor3 emp1 = new Constructor3(12, 23, "Ashish", "Microfocus");
        System.out.println(emp1.id);
        System.out.println(emp1.doJ);
        System.out.println(emp1.name);
        System.out.println(emp1.companyName);
        System.out.println("-----------------------------------------");
        Constructor3 emp2 = new Constructor3(10,24, "Chaitanya","MicroSoft");
        System.out.println(emp2.id);
        System.out.println(emp2.doJ);
        System.out.println(emp2.name);
        System.out.println(emp2.companyName);

        System.out.println("-----------------------------------------");
        Constructor3 emp3 = new Constructor3(11,22, "Alok","Facebook");
        System.out.println(emp3.id);
        System.out.println(emp3.doJ);
        System.out.println(emp3.name);
        System.out.println(emp3.companyName);
    }

}
