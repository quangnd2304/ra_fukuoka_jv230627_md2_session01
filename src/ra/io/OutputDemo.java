package ra.io;

public class OutputDemo {
    public static void main(String[] args) {
        //1.In ra chuỗi Rikkei Academy - Học viện đào tạo CNTT, sau khi in xong xuống dòng
        //sout
        System.out.println("Rikkei Academy - Học viện đào tạo CNTT");
        //2.In ra chuỗi Xin chào các bạn, sau khi in xong không xuống dòng
        System.out.print("Xin chào các bạn");
        //3.In ra chuỗi có định dạng - System.out.printf("Format String",value1,value2...)
        System.out.printf("Bạn %s của lớp %s có tuổi %d - \tđiểm TB: %f\n","Nguyễn Văn A","JV230627",20,8.7);
        //printf: xuống dòng \n
        //printf: tab 1 tab \t
        //4.In ra lỗi: Các bạn lớp JV230627 đã vi phạm thời gian làm project module 01
        System.err.println("Các bạn lớp JV230627 đã vi phạm thời gian làm project module 01");
    }
}
