package topic5_ConstructorsInJava;

public class EmployeeTemplate {
    int id;
    int doJ;
    String name;
    String companyName;

    //jvm will create a default constructor and that constructor will assign default value of the respective type of variable

    //Invisible to me
//    public EmployeeTemplate() {
//        id = 0;
//        doJ = 0;
//        name = null;
//        companyName = null;
//    }

    // If you have defined your own constructor then the call will go that constructor . Not the default one
    public static void main(String[] args) {
        new EmployeeTemplate();
    }
}
