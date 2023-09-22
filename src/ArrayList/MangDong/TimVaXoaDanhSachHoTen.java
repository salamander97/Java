package ArrayList.MangDong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TimVaXoaDanhSachHoTen {
    ArrayList<String> list = new ArrayList<String>();

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập họ tên: ");
            String st=sc.nextLine();
            if(st.isEmpty()){
                break;
            }
            list.add(st);
        }while (true);
    }
    public void xuat(){
        System.out.println("-----Danh sách họ tên-----");
        for (String item:list){
            System.out.println("Họ tên: "+item);
        }
    }
    public void xuatNgauNhien(){
        Collections.shuffle(list);          //shuffle đảo ngẫu nhiên các phần tử trong arraylist
        xuat();
    }
    public void sapXep(){
        Collections.sort(list,(a,b)->a.compareTo(b));   //Sử dụng phương thức lambda expression để sắp xếp chuỗi String
        xuat();
    }
    public void timVaXoa(){
        System.out.println("Nhập họ tên cần tìm để xoá: ");
        Scanner sc = new Scanner(System.in);
        String hoten = sc.nextLine();

        for (String item:list){
            if (item.equals(hoten)){
                list.remove(item);
                break;
            }
        }
    }
    public void hienthiMenu(){
        do {
            System.out.println("------------Menu chức năng chương trình------------");
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Nhập danh sách");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Sắp xếp danh sách");
            System.out.println("4. Hiển thị ngẫu nhiên danh sách");
            System.out.println("5. Tìm kiếm và xoá họ tên trong danh sách");
            System.out.print("6. Lựa chọn của bạn: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    sapXep();
                    break;
                case  4:
                    xuatNgauNhien();
                    break;
                case 5:
                    timVaXoa();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }while (true);
    }
}

