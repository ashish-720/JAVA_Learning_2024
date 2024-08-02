package topic3_Loops;

import java.util.Scanner;

public class D_JumpStatements {

    public static void main(String[] args) {
        //break, continue, return etc

        //break

//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the number from 1-100");
//        int number = scn.nextInt();
//        for (int count = 2; count <= number; count += 2) {
//            if (count > 40) {
//                break;
//            }
//            if (count % 2 == 0) {
//                System.out.println("Number is even Dont worry :" + count);
//            }
//        }

        //continue

        for (int count = 1; count <= 100; count++) {
            if (count == 50 || count == 51) {
                continue;
            }
            System.out.println("I am going to ofc Day " + count);
        }
    }

}
