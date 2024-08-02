package topic3_Loops.nestedLoops;

public class Pattern3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {

            int j = 1;
            do {
                System.out.print("*");
                j++;
            } while (j<=i);

            System.out.println();
        }
    }
}
