package methodsInJava;

public class Methods4 {

    public static void main(String[] args) {
        Methods4 m = new Methods4();
        m.m1(10.5f);
        m.m1(10);
        m.m1('w');
//        m.m1(10.9);
    }

    public void m1(float value) {
        System.out.println(value);
    }
}
