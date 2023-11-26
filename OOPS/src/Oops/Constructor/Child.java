package Oops.Constructor;

public class Child {
    public static void main(String[] args) {
        final Student std = new Student(20);
//        cannot reassign to std object as it is declared final.
//        std = new Student(45);
        Student std2 = new Student(40);
        std2 = new Student(20);
        Student std1 = new Student();
        std1.age = 25;
        System.out.println(std1.age);
        System.out.println(std.age);

    }
}
