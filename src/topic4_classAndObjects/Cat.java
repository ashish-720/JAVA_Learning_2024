package topic4_classAndObjects;

public class Cat {

    int age;
    String name;

    String breed;

    static int maxLifeSpan = 12;

    public void meow() {
        System.out.println("CAT IS SINGING MEOW");
    }

    public static void eatFood() {
        System.out.println("CAT IS EATING FOOD");
    }


    public static void main(String[] args) {


        Cat cat1 = new Cat();
        cat1.name = "Minu";
        cat1.age = 2;
        cat1.breed = "Indian";
        System.out.println(cat1.name);
        System.out.println(cat1.age);
        System.out.println(cat1.breed);
        cat1.meow();
        System.out.println(maxLifeSpan);
        System.out.println(Cat.maxLifeSpan);
//        System.out.println(cat1.maxLifeSpan);
        System.out.println("----------------");
        eatFood();
        Cat.eatFood();
//        cat1.eatFood();


        Cat cat2 = new Cat();
        cat2.name = "Sophie";
        cat2.age = 3;
        cat2.breed = "persian";
        cat2.meow();
        System.out.println(cat2.name);
        System.out.println(cat2.age);
        System.out.println(cat2.breed);
        System.out.println(Cat.maxLifeSpan);
        eatFood();
    }
}
