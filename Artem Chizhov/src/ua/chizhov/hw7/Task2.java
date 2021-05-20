package ua.chizhov.hw7;

public class Task2 {
    public static void main(String[] args) {
        Student firstStudent = new Aspirant("Artem", "Chizhov", "First");

        Student[] students = new Student[5];
        students[0] = new Student("Amanda", "Skill", "Math");
        students[1] = new Aspirant("Jack", "Brouwn", "Biology");
        students[2] = new Student("Ann", "Broun", "Ecology");
        students[3] = new Student("Max", "Naumav", "Math");
        students[4] = new Aspirant("Helen", "Stavrovski", "Engineering");

        for (Student student : students) {
            System.out.println(student.firstName + " (" + student.group + "):" + student.getScholarship());
        }
    }
}
