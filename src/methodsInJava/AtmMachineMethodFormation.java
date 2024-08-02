package methodsInJava;

public class AtmMachineMethodFormation {

    public static void main(String[] args) {
        displayCurrentBalance(2223335);
    }


    public static void displayCurrentBalance(int pin) {
        System.out.println(readCardDetails(pin));

    }

    public static int readCardDetails(int pinNumber) {
        //{}
        double accountNumber = 2;
        double alreadyExistingPinNumber = 2223335;
        double alreadyExistingAccount = 2223335;

        int accountBalance = 0;
        if (accountNumber == alreadyExistingAccount && pinNumber == alreadyExistingPinNumber) {
            System.out.println("Account details matched");
            accountBalance = 15000;
            return accountBalance;
        } else {
            System.out.println("Account is not valid");
            return accountBalance;
        }

    }


}
