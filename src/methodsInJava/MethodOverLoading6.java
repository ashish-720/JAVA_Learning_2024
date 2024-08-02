package methodsInJava;

public class MethodOverLoading6 {

    public void m1(int a, float b) {
        System.out.println("Int-float method");
    }

    public void m1(float b, int a) {
        System.out.println("float-Int method");
    }

    public static void main(String[] args) {
        MethodOverLoading6 m = new MethodOverLoading6();
        m.m1(12, 12.0f);
        m.m1(12.6f, 12);
//        m.m1(1,2);
//        m.m1(10.3f, 11.2f);
    }
}
