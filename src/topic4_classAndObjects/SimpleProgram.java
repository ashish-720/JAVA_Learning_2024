package topic4_classAndObjects;

import java.util.Scanner;

public class SimpleProgram {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number 1");
        int number1 = scn.nextInt();
        System.out.println("Enter number 2");
        int number2 = scn.nextInt();

        int sum = number1 + number2;
        System.out.println(sum);
    }
}
