package topic3_Loops.nestedLoops;

public class PracticalNestedLoopSituation {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Open the tab");
            System.out.println("Type google.com");

            int j = 1;
            while(j<=2){
                System.out.println("Type an alphabet A");
                System.out.println("Remove the same alpahabet A");
                j++;
            }
        }

    }
}
