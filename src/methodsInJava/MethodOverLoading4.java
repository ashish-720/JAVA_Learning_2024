package methodsInJava;

public class MethodOverLoading4 {
    public void m1(String name) {
        System.out.println("In String class method");
    }

    public void m1(Object ob) {
        System.out.println("In Object class method");
    }

    public static void main(String[] args) {
        MethodOverLoading4 m = new MethodOverLoading4();
        m.m1(new String("ashish"));
        m.m1(new Object());
        m.m1(null);
    }
}
