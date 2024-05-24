package topic1_VaiablesAndDataTypes.var2_BasedOnPosition;

public class Var2_InstanceVariables {
    // Instance variables can be accessed when we create an object through its object reference
    // variable is called as InstanceVariables
    // Its values is specific to an object if it is not initialized at the start
    // its lifetime is till the object is present in the memory.
    // by default when we create an object it will call default constructor which will initialize the default values to the instance variables.
    // Change in value of variable in one object will not affect the other object
    // Each non-static method in the class can access the instance variable directly but for static methods we need to create an object then with its ref variables we have to access it

    int i;
    String j;

    public Var2_InstanceVariables() {
        System.out.println("In Constructor" + " Non Static variable i value: " + i);
        i = 11;
    }

    public void nonStaticMethod() {
        System.out.println("In Non Static" + " static variable value " + i);
        System.out.println("In Non Static" + " static variable value " + j);
    }

    public static void main(String[] args) {
        Var2_InstanceVariables instanceVar1 = new Var2_InstanceVariables();
        System.out.println(instanceVar1.i);
        System.out.println(instanceVar1.j);
        instanceVar1.nonStaticMethod();
        instanceVar1.i = 10;
        instanceVar1.j = "ashish";
        System.out.println(instanceVar1.i);
        System.out.println(instanceVar1.j);

        Var2_InstanceVariables instanceVar2 = new Var2_InstanceVariables();
        System.out.println(instanceVar2.i);
        System.out.println(instanceVar2.j);
    }

}
