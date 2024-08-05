package topic5_ConstructorsInJava;

public class Mobile {
    //Constructor Overloading
    //name of Constructor should be same
    //1. number of argument should be different
    //2. number of arguments are same then argument type should be different
    //3. number of argumnet & type are same then position of arguments should be different(min arguments should be more than 1)

    String mobileBrand;
    String mobileModel;
    int mobileCost;
    String simInserted;
    boolean eSimSupported;

    public Mobile() {
        System.out.println("In zero parameter/argument constructor");
        mobileBrand = "Apple";
        mobileModel = "IPhone 13";
        mobileCost = 15000;
        simInserted = "Airtel";
        eSimSupported = true;
    }

    public Mobile(int mobileCost) {
        System.out.println("In one parameter/argument int type constructor");
        mobileBrand = "Apple";
        mobileModel = "IPhone 13";
        this.mobileCost = mobileCost;
        simInserted = "Airtel";
        eSimSupported = true;
    }

    public Mobile(String simInserted) {
        System.out.println("In one parameter/argument String type constructor");
        mobileBrand = "Apple";
        mobileModel = "IPhone 13";
        mobileCost = 15000;
        this.simInserted = simInserted;
        eSimSupported = true;
    }

    public Mobile(String mobileBrand, String mobileModel, int mobileCost, boolean eSimSupported, String simInserted) {
        System.out.println("In three parameter/argument String,String,int, boolean, String type constructor");
        this.mobileBrand = mobileBrand;
        this.mobileModel = mobileModel;
        this.mobileCost = mobileCost;
        this.simInserted = simInserted;
        this.eSimSupported = eSimSupported;
    }

    //Not possible CTE
//    public Mobile(String mobileBrand, String mobileModel, int mobileCost, boolean eSimSupported, String simInserted) {
//        System.out.println("In three parameter/argument String,String,int type constructor");
//        this.mobileBrand = mobileBrand;
//        this.mobileModel = mobileModel;
//        this.mobileCost = mobileCost;
//        this.simInserted = simInserted;
//        this.eSimSupported = eSimSupported;
//    }

    public Mobile(String mobileBrand, String mobileModel, int mobileCost, String simInserted, boolean eSimSupported) {
        System.out.println("In three parameter/argument String,String,int, String, boolean type constructor");
        this.mobileBrand = mobileBrand;
        this.mobileModel = mobileModel;
        this.mobileCost = mobileCost;
        this.simInserted = simInserted;
        this.eSimSupported = eSimSupported;
    }

    public static void main(String[] args) {

        System.out.println("In Mumbai Iphone 13 get manufactured");
        Mobile appleIphone13_1 = new Mobile();
        System.out.println(appleIphone13_1.mobileBrand);
        System.out.println(appleIphone13_1.mobileModel);
        System.out.println(appleIphone13_1.mobileCost);
        System.out.println(appleIphone13_1.simInserted);
        System.out.println(appleIphone13_1.eSimSupported);

        Mobile appleIphone13_2 = new Mobile();
        System.out.println(appleIphone13_2.mobileBrand);
        System.out.println(appleIphone13_2.mobileModel);
        System.out.println(appleIphone13_2.mobileCost);
        System.out.println(appleIphone13_2.simInserted);
        System.out.println(appleIphone13_2.eSimSupported);

        System.out.println("In different states Iphone 13 get manufactured, So the cost will be different");

        Mobile appleIphone13_3 = new Mobile(14000); //State karnataka
        System.out.println(appleIphone13_3.mobileBrand);
        System.out.println(appleIphone13_3.mobileModel);
        System.out.println(appleIphone13_3.mobileCost);
        System.out.println(appleIphone13_3.simInserted);
        System.out.println(appleIphone13_3.eSimSupported);

        Mobile appleIphone13_4 = new Mobile(13000); //State Odisha
        System.out.println(appleIphone13_4.mobileBrand);
        System.out.println(appleIphone13_4.mobileModel);
        System.out.println(appleIphone13_4.mobileCost);
        System.out.println(appleIphone13_4.simInserted);
        System.out.println(appleIphone13_4.eSimSupported);

        System.out.println("In Mumbai Iphone 13 get manufactured");
        Mobile appleIphone13_5 = new Mobile("Jio"); //Jio Sim
        System.out.println(appleIphone13_5.mobileBrand);
        System.out.println(appleIphone13_5.mobileModel);
        System.out.println(appleIphone13_5.mobileCost);
        System.out.println(appleIphone13_5.simInserted); //Jio
        System.out.println(appleIphone13_5.eSimSupported);


        Mobile appleIphone13_6 = new Mobile("BSNL"); //BSNL Sim
        System.out.println(appleIphone13_6.mobileBrand);
        System.out.println(appleIphone13_6.mobileModel);
        System.out.println(appleIphone13_6.mobileCost);
        System.out.println(appleIphone13_6.simInserted); //BSNL
        System.out.println(appleIphone13_6.eSimSupported);

        System.out.println("Most versatile objects");
        Mobile appleIphone13_7 = new Mobile("Samsung", "S22", 10000, true, "BSNL");
        System.out.println(appleIphone13_7.mobileBrand); //Samsung
        System.out.println(appleIphone13_7.mobileModel); //S22
        System.out.println(appleIphone13_7.mobileCost); //10000
        System.out.println(appleIphone13_7.simInserted); //BSNL
        System.out.println(appleIphone13_7.eSimSupported); //true

        Mobile appleIphone13_8 = new Mobile("Motorola", "M234", 18000, false, "Airtel");
        System.out.println(appleIphone13_8.mobileBrand); //Motorola
        System.out.println(appleIphone13_8.mobileModel); //M234
        System.out.println(appleIphone13_8.mobileCost); //18000
        System.out.println(appleIphone13_8.simInserted); //Airtel
        System.out.println(appleIphone13_8.eSimSupported); //false

        Mobile appleIphone13_9 = new Mobile("One Plus", "ONEPLUS 11PRO", 19000, "AIRCEL", true);
        System.out.println(appleIphone13_9.mobileBrand); //One Plus
        System.out.println(appleIphone13_9.mobileModel); //ONEPLUS 11PRO
        System.out.println(appleIphone13_9.mobileCost); //19000
        System.out.println(appleIphone13_9.simInserted); //AIRCEL
        System.out.println(appleIphone13_9.eSimSupported); //true
    }

}
