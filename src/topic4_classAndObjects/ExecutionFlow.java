package topic4_classAndObjects;

public class ExecutionFlow {

    static int i = 100;
    int j = 50;

    public void method1() {
        int k = 60;
        System.out.println(k);
        System.out.println(i);
        System.out.println(j);
    }

    public static void main(String[] args) {
        ExecutionFlow e = new ExecutionFlow();
        e.method1();

        ExecutionFlow e2 = new ExecutionFlow();
        e2.j = 70;
        e2.method1();
    }

}
