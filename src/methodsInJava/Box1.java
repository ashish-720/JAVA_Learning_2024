package methodsInJava;

public class Box1 {

    int l = 10;
    int b = 20;
    int h = 30;

    public static void main(String[] args) {
        Box1 b1 = new Box1();
        System.out.println(b1.l);
        System.out.println(b1.b);
        System.out.println(b1.h);
        b1.changeDimensions(b1);
        System.out.println("------------------------");
        System.out.println(b1.l);
        System.out.println(b1.b);
        System.out.println(b1.h);
    }

    public void changeDimensions(Box1 bx1) {
        bx1.l++;
        bx1.b++;
        bx1.h++;

    }
}
