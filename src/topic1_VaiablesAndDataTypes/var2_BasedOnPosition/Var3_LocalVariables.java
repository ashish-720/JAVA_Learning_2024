package topic1_VaiablesAndDataTypes.var2_BasedOnPosition;

public class Var3_LocalVariables {

    // Declared inside a method
    // Scope is also inside the method where it is declared
    // Access modifiers and static/Non-static keywords are not applicable for local variables
    static int var1 = 10;

    public static void m1() {
        // System.out.println(i); It will give CTE as i's scope in inside main()
    }

    public static void main(String[] args) {
        int i;
        // System.out.println(i);initialization of local variable is must if we want to use it otherwise it
        // will throw CTE as no default value is assigned to it
        i = 9;
        int var1 = 12;
        System.out.println(i);
        System.out.println(var1);//Note if both the local and global(Static and Instance) variable has same name the precedence will be given to local variable value
    }

}
