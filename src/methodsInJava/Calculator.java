package methodsInJava;

public class Calculator {

    public static void main(String[] args) {
        //person 1 logic for addition
        int number1 = 2;
        int number2 = 3;
        int sum = number1 + number2;
        System.out.println(sum);

        System.out.println("---------------------------");
        //person 2 logic for addition
        int number3 = 4;
        int number4 = 2;
        int sum2 = number3 + number4;
        System.out.println(sum2);
        System.out.println("---------------------------");
        //person 3 smart tha
        displayAdditionOfTwoNumbers(5, 2);
        System.out.println("---------------------------");
        //person 4 smart tha

        displayAdditionOfTwoNumbers(4, 4);
        System.out.println("---------------------------");
    }


    public static void displayAdditionOfTwoNumbers(int number1, int number2) {
        int sum = number1 + number2;
        System.out.println(sum);
    }



}
