public class ThesisManagement {
    public static void main(String[] args) {
        Student s1 = new Student("Nguyen Van A", "S101", "a@email.com");
        Student s2 = new Student("Tran Thi B", "S102", "b@email.com");
        Student s3 = new Student("Le Van C", "S103", "c@email.com");

        Teacher t1 = new Teacher("GS. Bach", "T001", "bach@email.com", "Giáo sư");
        Advisor a1 = new Advisor("Mr. David", "david@corp.com");

        KLTN<Student, IGuide> kltn1 = new KLTN<>(s1, t1, "Xây dựng hệ thống AI nhận diện khuôn mặt");
        KLTN<Student, IGuide> kltn2 = new KLTN<>(s2, a1, "Phân tích dữ liệu Big Data cho thương mại điện tử");
        KLTN<Student, IGuide> kltn3 = new KLTN<>(s3, t1, "An toàn thông tin cho ứng dụng di động");

        ListSortable<KLTN<Student, IGuide>> danhSachKLTN = new ListSortable<>();

        danhSachKLTN.add(kltn1);
        danhSachKLTN.add(kltn2);
        danhSachKLTN.add(kltn3);

        danhSachKLTN.print();
    }
}