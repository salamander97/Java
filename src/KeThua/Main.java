package KeThua;
/*
Có 4 loại phạm vi truy cập
    ・Privateー＞ Chỉ cho phé p truy cập nội bộ ở trong class
    ・Protectedー＞ Chỉ có thể áp dụng trong class như thuộc tính,class hay lớp con.
                    Không áp dụng cho lớp ngoài hay interface
    ・Defaultー＞ Phạm vi truy cập chỉ nằm trong nội bộ của package
    ・Pubicー＞ Phạm vi truy cập rộng, có thể truy cập được bất kỳ đâu project trong java
 */

import KeThua.mypackage.KeThuaStudent;
import KeThua.mypackage.Person;
public class Main {
    public static void main(String[] args) {
        Person a=new KeThuaStudent("Hieu",26,1.7f,"ECC  コンピュータ専門学校");
        a.eat("Rice");
        a.getInfo();
    }
}
