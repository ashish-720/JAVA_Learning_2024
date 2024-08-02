package methodsInJava;

public class Cat {
    //passByReference

    String name;
    String color;
    int age;

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Sophie";
        cat1.color = "Brown";
        cat1.age = 1;
        System.out.println(cat1.name);
        System.out.println(cat1.color);
        System.out.println(cat1.age);

        Cat cat2;
        cat2 = cat1;
        cat2.name = "Minu";
        cat2.color = "Black and white";
        cat2.age = 2;
        System.out.println(cat2.name);
        System.out.println(cat2.color);
        System.out.println(cat2.age);
        System.out.println("------------------------------------");
        System.out.println(cat1.name);
        System.out.println(cat1.color);
        System.out.println(cat1.age);

    }
}
