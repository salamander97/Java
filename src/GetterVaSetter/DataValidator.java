package GetterVaSetter;
//Kiểm tra giá trị nhập vào có chính xác hay không

public class DataValidator {
    public boolean isEmail(String st){
        String pattern = "\\w+@\\w+\\.\\w+";
        return st.matches(pattern);
    }
    public boolean isSDT(String sdt){
        String pattern = "0\\d{9}";         //So di dong
        return sdt.matches(pattern);

    }
    public  boolean isCMND(String  st){
        String pattern = "\\d{9}";
        return st.matches(pattern);

    }
}

