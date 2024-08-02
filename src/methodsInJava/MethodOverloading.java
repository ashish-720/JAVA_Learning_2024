package methodsInJava;

public class MethodOverloading {

    //Methods with same name but different parameters.
    //Why it is required? - To handle or to maintain minimum naming convention

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.add(12.0f, 1);
    }

    public void add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
    }

    public void add(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        System.out.println(sum);
    }

    public void add(float num1, int num2) {
        float sum = num1 + num2;
        System.out.println(sum);
    }
}
