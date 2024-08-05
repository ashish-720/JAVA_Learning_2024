package topic5_ConstructorsInJava;

public class Constructor4 {
    //Constructor Overloading
    //name of Constructor should be same
    //1. number of argument should be different
    //2. number of arguments are same then argument type should be diiferent
    //3. number of argumnet & type are same then position of arguments should be different(min arguments should be more than 1)

    int id;
    String name;
    int salary;
    String companyName;


    public Constructor4() {
        System.out.println("In Zero parameterized Constructor");
    }

    public Constructor4(int a) {
        System.out.println("In one parameterized int Constructor");
        id = a;
        name = "Dheeraj";
        companyName = "Facebook";
        salary = 3000;
    }


//    public Constructor4(int a) {
//        System.out.println("In one parameterized int Constructor");
//        id = a;
//        name = "Dheeraj";
//        companyName = "Facebook";
//        salary = 3000;
//    }
    public Constructor4(String a) {
        System.out.println("In one parameterized String Constructor");
        id = 23;
        name = a;
        companyName = "Tesla";
        salary = 2500;
    }

    public Constructor4(int a, String b) {
        System.out.println("In int-String two parameter/argument constructor");
        id = a;
        name = b;
        companyName = "Google";
    }

    public Constructor4(String a, int b) {
        System.out.println("In String -int  two parameter/argument constructor");
        id = b;
        name = a;
        companyName = "Microsoft";
        salary = 2000;
    }

    public static void main(String[] args) {
        Constructor4 emp1 = new Constructor4(); //if we have defined constructor in the class we have to use the same constructor other wise CTE
        System.out.println(emp1.id); //o/p o
        System.out.println(emp1.name);  //null
        System.out.println(emp1.salary);  //0
        System.out.println(emp1.companyName); //null

        System.out.println("-----------------------------------------------------");
        Constructor4 emp2 = new Constructor4(12, "Ashish");
        System.out.println(emp2.id); //12
        System.out.println(emp2.name); //Ashish
        System.out.println(emp2.salary); //0
        System.out.println(emp2.companyName); //Google

        System.out.println("-----------------------------------------------------");
        Constructor4 emp3 = new Constructor4(10, "Chaitanya");
        System.out.println(emp3.id); //12
        System.out.println(emp3.name); //Ashish
        System.out.println(emp3.salary); //0
        System.out.println(emp3.companyName); //Google

        System.out.println("-----------------------------------------------------");
        Constructor4 emp4 = new Constructor4("Alok", 11);
        System.out.println(emp4.id); //11
        System.out.println(emp4.name); //Alok
        System.out.println(emp4.salary); //2000
        System.out.println(emp4.companyName); //Microsoft

        System.out.println("-----------------------------------------------------");
        Constructor4 emp5 = new Constructor4(9);
        System.out.println(emp5.id); //9
        System.out.println(emp5.name); //Dheeraj
        System.out.println(emp5.salary); //3000
        System.out.println(emp5.companyName); //Facebook
    }

}
