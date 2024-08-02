package methodsInJava;

public class PassByValue {
    public static void main(String[] args) {
        int var1 = 10;
        System.out.println(var1);
        int var2 = var1;
        System.out.println(var2);
        var2 = 11;
        System.out.println(var2);
        System.out.println(var1);
    }
}
