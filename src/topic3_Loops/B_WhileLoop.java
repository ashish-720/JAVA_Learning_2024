package topic3_Loops;

import java.util.Scanner;

public class B_WhileLoop {

    public static void main(String[] args) {
        //initialization, check condition, increament/decreament

//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int number = scn.nextInt();
//        int count = 1;
//        while (count <= number) {
//            System.out.println(" I am going to ofc on Day "+count);
//            count++;
//        }

//        int count = 1;
//        while (count <= 7) {
//            System.out.println(" I am going to ofc on Day " + count);
//            count++;
//        }

        int number = 101;
        while (number <= 100) {
            if (number % 2 == 0) {
                System.out.println(" I am going to ofc on Day " + number);
            }
            number += 1;
        }

    }
}
