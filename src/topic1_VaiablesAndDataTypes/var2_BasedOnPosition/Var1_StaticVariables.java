package topic1_VaiablesAndDataTypes.var2_BasedOnPosition;

public class Var1_StaticVariables {
    // static variables are used when it will not change from object to object
    // It will be declared at class level.
    // its life till class is present in the memory.
    // we declare it by using static keyword.
    // when to decide the variable should be static -> If its value is constant for
    // the whole session.

    // Example Suppose there are 500 students in my college, now all instance data
    // members will get memory each time when the object is created. All students
    // have its unique rollno and name, so instance data member is good in such
    // case. Here, "college" refers to the common property of all objects. If we
    // make it static, this field will get the memory only once So benefit is memory saving.

    //we can call static variables in static methods or non-static methods in three ways -> 1. directly(if declared in same class), 2. By Classname, 3. By Reference variable of the class where it is declared.
    //we can call static variable in constructor as well.
    //Once the value of static variable is modified it is modified for rest of the execution of the program

    static int var = 10;

    public Var1_StaticVariables() {
        System.out.println("In constructor" + " static variable value " + Var1_StaticVariables.var);
        Var1_StaticVariables.var = 57;
    }

    public void nonStaticMethod() {
        System.out.println("In Non Static" + " static variable value " + var);
    }

    public static void main(String[] args) {
        Var1_StaticVariables sv = new Var1_StaticVariables();
        System.out.println(sv.var);
        System.out.println(Var1_StaticVariables.var);
        sv.nonStaticMethod();
        Var1_StaticVariables.var = 23;
        System.out.println(var);
        sv.var = 20;
        System.out.println(sv.var);
        System.out.println(var);
    }


}
