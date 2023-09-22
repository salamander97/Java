package TinhLoiNhuanGop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TinhLoiNhuanGop {
    public static void main(String[] args) {
        long tienDauTu,giaNhap,giaBan,tienThueMatBang,thuenhanvien,chiPhiKhac,doanhSo;
        long DiemHoaVon=0;
        long LoiNhuanGop=0;
        long duDoanLayLaiVon;
        long DoanhSo1Thang;
        long DuDinhThuHoiVon;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số tiền đầu tư của bạn:");
        tienDauTu=sc.nextLong();
        System.out.print("Dự định trong bao nhiêu tháng bạn thu hồi vốn:");
        DuDinhThuHoiVon=sc.nextLong();
        System.out.print("Tiền thuê mặt bằng/Tháng: ");
        tienThueMatBang= sc.nextLong();
        System.out.print("Tiền thuê nhân viên/Tháng:");
        thuenhanvien=sc.nextLong();
        System.out.print("Các chi phí khác(Tiền điện, nước...):");
        chiPhiKhac=sc.nextLong();
        System.out.print("Nhập vào trung bình giá nhập các sản phẩm: ");
        giaNhap= sc.nextLong();
        System.out.print("Nhập vào trung bình giá bán các sản phẩm: ");
        giaBan= sc.nextLong();
        LoiNhuanGop=(giaBan-giaNhap)/giaBan;
        DiemHoaVon=(tienThueMatBang+thuenhanvien+chiPhiKhac)/LoiNhuanGop;
        DoanhSo1Thang= tienDauTu/DuDinhThuHoiVon;
        doanhSo=(DoanhSo1Thang+tienThueMatBang+thuenhanvien+chiPhiKhac)/LoiNhuanGop;
//        DecimalFormat df=new DecimalFormat("#.###");        //Định dạng chuỗi với 3 chữ số thập phân
        System.out.println("1 tháng bạn cần bán "+DiemHoaVon+" triệu thì mới hoà vốn");
        System.out.println("Lợi nhuận bạn phải kiếm được :"+DoanhSo1Thang+"triệu/tháng");
        System.out.println("Doanh số 1 tháng tối thiểu cần "+doanhSo+" triệu để có thể vừa thu hồi vốn vừa không bị lỗ.");
        System.out.println("Bạn cần doanh số "+doanhSo/30+"triệu/ngày để vừa thu hồi vốn vừa không bị lỗ");

    }
}
