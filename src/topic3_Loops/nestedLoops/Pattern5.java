package topic3_Loops.nestedLoops;

public class Pattern5 {

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {

            for(int k =1; k<=i-1; k++){
                System.out.print(" ");
            }

            for(int j = 1; j<=4-(i-1); j++){
                System.out.print("*");
            }
            System.out.println();

        }


    }
}
