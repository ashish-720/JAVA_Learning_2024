package methodsInJava;

public class AppleMobiles {

    String mobileVersion;
    int mobileCost;


    public static void main(String[] args) {

        AppleMobiles phone1 = new AppleMobiles();
        System.out.println(phone1.mobileVersion);
        System.out.println(phone1.mobileCost);
        phone1.createAppleMoblie("Iphone 13", 15000);

        System.out.println(phone1.mobileVersion);
        System.out.println(phone1.mobileCost);

        System.out.println("-----------------------------------------------------");

        AppleMobiles phone2 = new AppleMobiles();
        phone2.mobileVersion = "Iphone 14";
        phone2.mobileCost = 12000;

        System.out.println(phone2.mobileVersion);
        System.out.println(phone2.mobileCost);
    }

    public void createAppleMoblie(String mobileVersion, int mobileCost) {
        this.mobileVersion = mobileVersion;
        this.mobileCost = mobileCost;
    }
}
