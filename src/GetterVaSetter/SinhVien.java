package GetterVaSetter;

import java.util.Scanner;

public class SinhVien {
    private  String hoTen, email, sdt, cmnd;

    public SinhVien(String hoTen, String email, String sdt, String cmnd) {
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.cmnd = cmnd;
    }

    public SinhVien() {

    }

    public void xuat(){
        System.out.printf("Ho ten: %s - Email: %s - SĐT: %s - CMND: %s \n",hoTen,email,sdt,cmnd);
    }
    public void nhap(Scanner sc){
        do{
            System.out.print("Nhập họ tên: ");
            hoTen=sc.nextLine();
            if(hoTen==null||hoTen.equals("")){
                System.out.println("Họ tên không hợp lệ. Vui lòng thử lại");
            }else {
                break;
            }
        }while (true);
        DataValidator dv=new DataValidator();
        do {
            System.out.print("Nhập họ email: ");
            email=sc.nextLine();
            if (dv.isEmail(email)){
                break;
            }
            System.out.println("Email không hợp lệ. Vui lòng thử lại");
        }while (true);
        do {
            System.out.print("Nhập họ sđt: ");
            sdt = sc.nextLine();
            if(dv.isSDT(sdt)){
                break;
            }
            System.out.println("SĐT không hợp lệ. Vui lòng thử lại");
        }while (true);
        do{
            System.out.print("Nhập họ cmnd: ");
            cmnd=sc.nextLine();
            if(dv.isCMND(cmnd)){
                break;
            }
            System.out.println("CMND không hợp lệ. Vui lòng thử lại");
        }while (true);
    }
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
}

