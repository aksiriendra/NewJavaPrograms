package Objectsandclasses;

public class Student {
    private String name;
    private int age;
    private String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayinfo() {
        System.out.println("Student Name: " + name);
        System.out.println(name + "'s Age is: " + age);
        System.out.println(name + "'s Grade is: " + grade);

    }

    public static void main(String[] args) {

        Student[] students = new Student[8];

        students[0] = new Student("Akhil", 28, "A+");
        students[1] = new Student("Priyatham", 30, "A+");
        students[2] = new Student("Ankita", 22, "A+");
        students[3] = new Student("Upendra", 32, "A+");
        students[4] = new Student("Sanjeev", 32, "A+");
        students[5] = new Student("Ramya", 35, "A+");
        students[6] = new Student("Shiva", 40, "A+");
        students[7] = new Student("Abhilash", 32, "A+");

        for (Student student : students) {
            student.displayinfo();
            System.out.println("");
        }
    }

}