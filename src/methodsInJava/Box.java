package methodsInJava;

public class Box {
    //Call By Value

    int l = 10;
    int b = 20;
    int h = 30;

    public static void main(String[] args) {
        Box b1 = new Box();
        System.out.println(b1.l);
        System.out.println(b1.b);
        System.out.println(b1.h);
        b1.changeDimensions(b1.l, b1.b, b1.h);
        System.out.println("----------------------");
        System.out.println(b1.l);
        System.out.println(b1.b);
        System.out.println(b1.h);


    }

    public void changeDimensions(int x, int y, int z) {
        x++;
        y++;
        z++;
    }

}
