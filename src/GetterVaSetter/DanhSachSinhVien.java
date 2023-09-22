package GetterVaSetter;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> list=new ArrayList<>();
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            SinhVien sv = new SinhVien();
            boolean trungLap;

            do {
                trungLap = false; // Khởi tạo biến trungLap là false
                sv.nhap(sc); // Yêu cầu người dùng nhập giá trị

                // Kiểm tra xem giá trị nhập vào đã tồn tại trong danh sách hay chưa
                for (SinhVien item : list) {
                    if (item.equals(sv)) {
                        trungLap = true;
                        System.out.println("Giá trị đã tồn tại. Vui lòng nhập lại.");
                        break;
                    }
                }
            } while (trungLap); // Lặp lại nếu giá trị nhập vào đã trùng lặp
            list.add(sv);
        }
    }
    public void xuat(){
        System.out.println("----------------------------------");
        System.out.println("Danh sach sinh vien: ");
        for (SinhVien item : list){
            item.xuat();
        }
    }
}
