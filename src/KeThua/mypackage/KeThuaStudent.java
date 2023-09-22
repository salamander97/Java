package KeThua.mypackage;

public class KeThuaStudent extends Person{
    //_2 Muốn cập nhật thêm thông tin nhiều hơn ở lớp cha thì có thể thêm vào code tuỳ ý
    public String University;
    public KeThuaStudent(String name, int age, float height,String university){
        //_1    super() để cho lớp con truy cập vào các thứ liên quan đến lớp cha
        //_1    super để gọi phương thức khởi tạo lớp cha
        super(name, age, height);
        this.University=university;
    }
    public void getInfo(){
        super.getInfo();
        System.out.println("University Name: "+this.University);
    }
}
