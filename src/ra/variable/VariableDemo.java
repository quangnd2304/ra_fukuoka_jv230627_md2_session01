package ra.variable;

public class VariableDemo {
    public static void main(String[] args) {
        //1. Khai báo biến mã sinh viên và tên sinh viên
        //Datatype variableName
        String studentId;
        String studentName;
        //2. Khởi tạo giá trị cho biến studentId và studentName
        //variableName = value
        studentId = "SV001";
        studentName = "Nguyễn Văn A";
        //3. Khai báo và khởi tạo biến tuổi sinh viên có giá trị bằng 18
        //datatype variable = value
        //Format code: Ctrl + alt + L
        int age = 18;
        //Khai báo và khởi tạo biến điểm trung bình (float) sinh viên = 7.8
        float avgMark = 7.8F;
        //Khai báo và khởi tạo biến giới tính sinh viên có kiểu boolean có giá trị true
        boolean sex = true;
        //Khai báo 1 mảng
        int[] arrInt = {1,2,3,4};
        //4. Khai báo và khởi tạo các biến cùng kiểu dữ liệu: a,b,c có kiểu double
        double a = 8.5, b = -5.6, c = 12.7;
        //5. Ép kiểu dữ liệu
        float d = (float)8.9;
        //8.9 - double
        //d - float --> d=8.9--> từ kiểu dữ liệu cao (double) xuống kiểu dữ liệu thấp (float)
        //explicit - tường minh
        float f = 10;
        //10 - int
        //f - float --> f=10 --> từ kiểu dữ liệu thấp (int) lên kiểu dữ liệu cao (float)
        //implicit - ngầm định
        //6. Khai báo hằng số PI
        final float PI = 3.14F;
    }
}
