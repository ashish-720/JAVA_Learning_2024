package topic4_classAndObjects;

public class Accesibility {

    static int i = 12;
    int j = 13;

    public static void m1() {
        System.out.println("In m1 static method");
        System.out.println(i);
        m2();
//        Accesibility as = new Accesibility();
//        System.out.println(as.j);
//        System.out.println(j); direct access not possible
//        m3();direct access not possible
    }

    public static void m2() {
        System.out.println("In m2 static method");
    }

    public void m3() {
        System.out.println("In m3 Non-static method");
        System.out.println(i);
        m1();
        System.out.println(j);
        m4();
    }

    public void m4() {
        System.out.println("In m4 Non-static method");
    }
}
