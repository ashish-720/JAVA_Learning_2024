package topic3_Loops;

public class C_DoWhileLoop {

    public static void main(String[] args) {

        //iniatization , condition check, increament/decreament

//        int count = 1;
//        do {
//            System.out.println(" I am going to ofc on Day " + count);
//            count++;
//        } while (count <= 7);


//        int count = 1;
//        do {
//            System.out.println(" I am going to ofc on Day " + count);
//            count++;
//        } while (count>0);

        int number = 1;
        do {
            if (number % 2 == 0) {
                System.out.println(" I am going to ofc on Day " + number);
            }
            number++;
        } while (number <= 100);

    }
}
