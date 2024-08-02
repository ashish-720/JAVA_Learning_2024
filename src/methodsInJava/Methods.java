package methodsInJava;

public class Methods {

    public static void main(String[] args) {
        Methods.m1();
        Methods.m2(20);
        Methods.m3("Ashish");
        Methods.m4(true);
        Methods.m5(10.0f);
        Methods.m6("Ashish", "Samal", 10);

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println(m7());
        System.out.println(m8(20, "aaa"));
        System.out.println(m9());
        System.out.println(m10(10.8f));
    }


    public static void m1() {
        System.out.println("In m1 static method");
    }

    public static void m2(int i) {
        System.out.println("In m2 static method");
        System.out.println(i);
    }

    public static void m3(String name) {
        System.out.println("In m3 static method");
        System.out.println(name);
    }

    public static void m4(boolean checkCondition) {
        System.out.println("In m4 static method");
        System.out.println(checkCondition);
    }

    public static void m5(float value) {
        System.out.println("In m5 static method");
        System.out.println(value);
    }

    public static void m6(String arg1, String arg2, int i) {
        System.out.println("In m6 static method");
        System.out.println(arg1 + "---" + arg2 + "---" + i);
    }

    public static int m7(){
        System.out.println("In m7 method");
        return 2;
    }
    public static int m8(int value, String name){
        System.out.println("In m8 method" + value+name);
        return 2;
    }

    public static String m9(){
        System.out.println("In m9 method");
        return "Ashish";
    }

    public static boolean m10(float value){
        return false;
    }
}
