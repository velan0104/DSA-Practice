package Oops.Constructor;

public final class Student {
    int age;
    Student(){
        System.out.println("Age: " + this.age);
    }

    Student(int year){
        this.age = year;
        System.out.println("Age: "+ this.age);
    }
}
