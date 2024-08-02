package topic4_classAndObjects;

public class StaticAndNonStatic {


    static int c = 100;
    int d = 12;


    public static void main(String[] args) {
        System.out.println(c);
        System.out.println(StaticAndNonStatic.c);
        staticMethod1();
        StaticAndNonStatic.staticMethod1();
//        System.out.println(Student.schoolName);
    }

    public static void staticMethod1() {

    }


    public void nonStaticMethod3() {

    }

    public void nonStaticMethod2() {
        System.out.println(c);
        staticMethod1();
        System.out.println(StaticAndNonStatic.c);
        StaticAndNonStatic.staticMethod1();

        System.out.println(d);
        nonStaticMethod3();
    }

}
