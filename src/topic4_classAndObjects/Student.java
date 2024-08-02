package topic4_classAndObjects;

public class Student {

    String name;
    int rollNumber;
    static String schoolName = "DPS";

    public void study() {
        System.out.println("In Studying");
    }

    public void play() {
        System.out.println("Playing");
    }

    public static void main(String[] args) {
        System.out.println(schoolName);
        System.out.println(Student.schoolName);

        Student std1 = new Student();
        System.out.println(std1.name);
        System.out.println(std1.rollNumber);
        System.out.println(std1.schoolName);
        std1.name = "Ashish";
        std1.rollNumber = 2;
        System.out.println(std1.name);
        System.out.println(std1.rollNumber);
        std1.study();
        std1.play();
        System.out.println(std1.schoolName);

        System.out.println("----------------------------------------------");


      Student std2 = new Student();
        System.out.println(std2.name);
        System.out.println(std2.rollNumber);
        System.out.println(std2.schoolName);
        std2.name = "Alok";
        std2.rollNumber = 3;
        System.out.println(std2.name);
        System.out.println(std2.rollNumber);
        std2.study();
        std2.play();
        System.out.println(std2.schoolName);
    }

}
