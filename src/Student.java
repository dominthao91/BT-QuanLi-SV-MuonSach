//Thư viện của trường đại học KHTN có nhu cầu cần quản lý việc mượn sách.
//        Sinh viên đăng ký và thamgia mượn sách thông qua các thẻ mượn mà thư viện đã thiết kế.-
//        Với mỗi thẻ mượn, có các thông tin sau: số phiếu mượn , ngày mượn, hạn trả , số hiệu sách,
//        và các thông tin riêng về mỗi sinh viên đó.- Các thông tin riêng về mỗi sinh viên đó bao gồm:
//        Họ tên, MSV, ngày sinh, lớp
//        .1. Hãy xây dựng lớpSinhVienđể quản lý các thông tin riêng về mỗi sinh viên.
//        2.Xây dựng lớpTheMuonđể quản lý việc mượn sách của mỗi đọc giả.
//        3. Xây dựng các phương thức để nhập và hiện thị các thông tin riêng cho mỗi sinh viên4.
//        In ra danh sách sinh viên,
//        tên sách mượn cần trả vào ngày cuối tháng

public class Student {
    private String id;

    private String name;

    private String dateOfBirth;

    private String className;

    public Student(String id, String name, String dateOfBirth, String className) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.className = className;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
