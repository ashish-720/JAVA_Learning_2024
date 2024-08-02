package methodsInJava;

public class Methods3 {

    public static void main(String[] args) {
        Methods3 m = new Methods3();
        m.m1();
        m.m2(12);
        m.m3("ashish");
        m.m4(true);
        m.m5(10.7f);
    }

    public void m1() {
        System.out.println("In m1 static method");
    }

    public void m2(int i) {
        System.out.println("In m2 static method");
        System.out.println(i);
    }

    public void m3(String name) {
        System.out.println("In m3 static method");
        System.out.println(name);
    }

    public void m4(boolean checkCondition) {
        System.out.println("In m4 static method");
        System.out.println(checkCondition);
    }

    public void m5(float value) {
        System.out.println("In m5 static method");
        System.out.println(value);
    }

    public void m6(String arg1, String arg2, int i) {
        System.out.println("In m6 static method");
        System.out.println(arg1 + "---" + arg2 + "---" + i);
    }

    public int m7() {
        System.out.println("In m7 method");
        return 2;
    }

    public int m8(int value, String name) {
        System.out.println("In m8 method" + value + name);
        return 2;
    }

    public String m9() {
        System.out.println("In m9 method");
        return "Ashish";
    }

    public boolean m10(float value) {
        return false;
    }
}
