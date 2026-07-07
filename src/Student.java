public class Student {
    String studentId;
    String studentName;
    int age;

    void displayData() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + age);
    }

    //Bài 4
    double calculateAvgScore(double math, double physics, double chemistry) {
        return (math + physics + chemistry) / 3;
    }

}
