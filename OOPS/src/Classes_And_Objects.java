class Human{
    int age;
    String name;
    static int num;
    public static void greet(){
        System.out.println("Good Morning!!");
    }
    Human(int age,String name){
        this.age = age;
        this.name = name;
        System.out.println(age + " " + name);
    }
}
public class Classes_And_Objects {
    static class Student{
        int rollNo;
        String name;
        int age;
        void greeting(){
            System.out.println("Hello! My name is " + name);
        }
        Student(){
            this.name = "velan";
            this.age = 19;
            this.rollNo = 20;
            greeting();
        }
    }
    public static void main(String[] args) {
//        Student std = new Student();
//        std.rollNo = 63;
//        System.out.println(std.age);
//        std.age = 19;
//        System.out.println(std.age);
//        System.out.println(std.rollNo);
        Human one = new Human(10, "velan");
        Human.num = 78;
        System.out.println(Human.num);
        Human.num = 90;
        System.out.println(Human.num);
        Human.greet();
    }
}
