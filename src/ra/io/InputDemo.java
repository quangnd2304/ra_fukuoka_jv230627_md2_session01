package ra.io;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        //Nhập vào mã sinh viên
        //1. Khởi tạo đối tượng Scanner từ lớp java.util.Scanner để hỗ trợ nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        //2. Thông báo nhập dữ liệu
        System.out.println("Nhập vào mã sinh viên");
        //3. Sử dụng các phương thức của Scanner để lấy dữ liệu nhập và lưu trữ vào biến
        String studentId = scanner.nextLine();
        //Nhập tên sinh viên
        System.out.println("Nhập vào tên sinh viên:");
        String studentName = scanner.nextLine();
        //Nhập vào tuổi sinh viên
        System.out.println("Nhập vào tuổi sinh viên:");
        //int age = scanner.nextInt();
        int age = Integer.parseInt(scanner.nextLine());
        //Nhập vào điểm trung bình sinh viên
        System.out.println("Nhập vào điểm trung bình của sinh viên:");
        //float avgMark = scanner.nextFloat();
        float avgMark = Float.parseFloat(scanner.nextLine());
        //Nhập vào giới tính sinh viên
        System.out.println("Nhập vào giới tính sinh viên:");
        //boolean sex = scanner.nextBoolean();
        boolean sex = Boolean.parseBoolean(scanner.nextLine());
        //Cách 1: scanner.nextLine();
        //Nhập vào địa chỉ sinh viên
        System.out.println("Nhập vào địa chỉ sinh viên: ");
        String address = scanner.nextLine();
        //In thông tin sinh viên
        System.out.println("THÔNG TIN SINH VIÊN:");
        System.out.println("Mã sinh viên: "+studentId);
        System.out.println("Tên sinh viên: "+studentName);
        System.out.println("Tuổi: "+age);
        System.out.println("Điểm TB: "+avgMark);
        System.out.println("Giới tính: "+sex);
        System.out.println("Địa chỉ: "+address);
    }
}
