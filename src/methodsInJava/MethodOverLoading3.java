package methodsInJava;

public class MethodOverLoading3 {
    public void m1(int a) {
        System.out.println("In int argument method");
    }

    public void m1(float f) {
        System.out.println("In float argument method");
    }

    public static void main(String[] args) {
        MethodOverLoading3 m3 = new MethodOverLoading3();
        m3.m1(10);
        m3.m1(12.3f);
        m3.m1('a');
        m3.m1(10l);
    }
}
