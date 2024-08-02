package methodsInJava;

public class MethodOverLoading5 {

    public void m1(String s) {
        System.out.println("In String m1");
    }

    public void m1(StringBuffer sb) {
        System.out.println("In String Buffer m1");
    }

    public static void main(String[] args) {
        MethodOverLoading5 m = new MethodOverLoading5();
        m.m1("ashish");
        m.m1(new StringBuffer("ashish"));
//        m.m1(null);
    }
}
