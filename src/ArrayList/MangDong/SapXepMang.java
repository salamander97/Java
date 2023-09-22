package ArrayList.MangDong;

import java.util.Arrays;
import java.util.Scanner;

public class SapXepMang {
    public static void main(String[] args) {

        //Sắp xếp thứ tự trong mảng
        int mang[]=new int[5];
        Scanner sc= new Scanner(System.in);
        for (int i=0;i<mang.length;i++){
            System.out.print("Nhập phần tử thứ "+(i+1)+":");
            mang[i]=sc.nextInt();
        }
        System.out.println("Các phần tử trong mảng :"+Arrays.toString(mang)+"");
        Arrays.sort(mang);
        System.out.println("Phần tử sau khi sắp xếp: "+Arrays.toString(mang)+"");

        //Tìm số lớn nhất nhỏ nhất trong mảng
        int min=mang[0];                //_Khai báo biến min và gán phần tử nhỏ nhất là phần tử đầu tiên trong mảng
        int max=mang[1];
        for(int i=1;i<mang.length;i++){
/*            if(min>mang[i]){
                 min=mang[i];
            }4
            if(max<mang[i]){
                max=mang[i];
            }
            */

            max=Math.max(max,mang[i]);
            min=Math.min(min,mang[i]);
        }
        System.out.println("Số lớn nhất là: "+max);
        System.out.println("Số nhỏ nhất là: "+min);

        //Tính giá trị trung bình trong mảng
        int sum=0,count=0;
        for (int i=0;i<mang.length;i++){
            sum +=mang[i];
            count++;
        }
        float average=(float) sum/count;        //Ép về kiểu số thực
        System.out.println("Tổng giá trị trong mảng là: "+sum);
        System.out.println("Giá trị trung bình trong mảng là: "+average);
    }
}
