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
    }
}
