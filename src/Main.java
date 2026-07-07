public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.studentId = "PH00001";
        student1.studentName = "Nguyễn Văn A";
        student1.age = 19;

        student2.studentId = "PH00002";
        student2.studentName = "Trần Thị B";
        student2.age = 20;

        System.out.println("Thông tin sinh viên 1:");
        student1.displayData();

        System.out.println("Thông tin sinh viên 2:");
        student2.displayData();

        double PointStudent1 = student1.calculateAvgScore(8.3, 9.2, 3.1);
        System.out.printf("Điểm của học sinh 1 là: %.1f%n", PointStudent1);

        double PointStudent2 = student2.calculateAvgScore(8.4, 6.2, 7.1);
        System.out.printf("Điểm của học sinh 2 là: %.1f%n", PointStudent2);
    }
}
