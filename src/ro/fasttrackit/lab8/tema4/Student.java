package ro.fasttrackit.lab8.tema4;

public class Student {
    public String name;
    public int grade;
    private static int sumOfGrades = 0;
    private static int totalStudents;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        totalStudents++;
        sumOfGrades = sumOfGrades + grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public static float average(int sumOfGrades, int totalStudents) {
        return (float) sumOfGrades/totalStudents;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Miti", 10);
        Student student2 = new Student("Paul", 7);
        Student student3 = new Student("Geo", 8);
        Student student4 = new Student("Andrei", 9);
        Student student5 = new Student("Nelu", 5);
        Student student6 = new Student("Flaviu", 10);
        Student student7 = new Student("Flaviu", 10);
        Student student8 = new Student("Flaviu", 10);

        System.out.println("Total numbers of students is " + Student.totalStudents);
        System.out.println("Sum of grades is " + Student.sumOfGrades);
        System.out.println("The average grade is " + average(sumOfGrades, totalStudents));

    }
}
