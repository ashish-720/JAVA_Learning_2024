
package methodsInJava;

public class VotingMachine {

    public static void main(String[] args) {


        boolean eligible = isPersonEligibleForVoting(3456, "ABC");
        System.out.println(eligible);
    }


    public static boolean isPersonEligibleForVoting(int aadharNumber, String password) {

        int age = getMeTheAge(aadharNumber, password);
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static int getMeTheAge(int aadharNumber, String password) {
        int alreadyExistingAadharNumber = 3456;
        String alreadyExistingPassword = "ABC";

        int age = -1;
        if (aadharNumber == alreadyExistingAadharNumber && password == alreadyExistingPassword) {
            age = 25;
            return age;
        } else
            return age;
    }
}
