package topic5_ConstructorsInJava;

public class Constructor2 {

    int age;
    String name;

    public static void main(String[] args) {
        Constructor2 c2 = new Constructor2(); // see Constructor2() is  a method basically which is getting called when object is getting created
        //so that method should have defined in the class . Here its default constructor which is invisble to us.
        System.out.println(c2.age);
        System.out.println(c2.name);
    }
}
