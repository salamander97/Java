package ArrayList.MangDong;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SapXepArrayList {
    public static void main(String[] args) {
/*        ArrayList<String> name = new ArrayList<String>();
        name.add("Hiếu");       <-[Hiếu]
        name.add("Dũng");       <-[Hiếu,Dũng]
        name.add("Phương");     <-[Hiếu,Dũng,Phương]
        name.add(1,"Hồng");     <-[Hiếu,Hồng,Dũng,Phương]
        name.set(3,"Hạnh");     <-[Hiếu,Hồng,Dũng,Hạnh,Phương]
        name.remove(3);         <-[Hiếu,Hồng,Dũng,Phương]
*/
        //Dùng for:each để thêm phần tử và duyệt phần tử trong mảng

        ArrayList<Double> nums=new ArrayList<Double>();
        Scanner sc= new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.print("Nhập phần tử thứ "+(i+1)+": ");
            Double item= sc.nextDouble();
            nums.add(item);
        }
//        nums.add(12.2);           //Thêm 1 phần tử vào trong mảng

        System.out.print("Các phần tử trong mảng là: [");
        int count=0;
        double tong=0;
        for (Double num:nums) {
            System.out.print(num);
            count++;
            if(count< nums.size()){
                System.out.print(" , ");
            }
            tong+=num;
        }
        System.out.println("]");

        //Số lớn nhất,nhỏ nhất trong mảng,sắp xếp mảng theo thứ tự tăng dần
        Double max=nums.get(0);
        Double min= nums.get(0);
        for (int i=0;i<nums.size();i++){
            max=Math.max(max,nums.get(i));
            min=Math.min(min,nums.get(i));
        }

        //Mảng động [ArraysList] không dùng Arrays.sort mà dùng Collections
        // sort  tăng dần________reverse  giảm dần
        Collections.sort(nums);
        System.out.print("Phần tử sau khi được sắp xếp tăng dần: [");
        int counts=0;
        for (Double num:nums) {
            System.out.print(num);
            counts++;
            if(counts< nums.size()){
                System.out.print(" , ");
            }
        }
        System.out.println("]");


        Collections.reverse(nums);
        System.out.print("Phần tử sau khi được sắp xếp giảm dần: [");
        int counts1=0;
        for (Double num:nums) {
            System.out.print(num);
            counts1++;
            if(counts1< nums.size()){
                System.out.print(" , ");
            }
        }
        System.out.println("]");
        System.out.println("Số lớn nhất trong mảng là: "+max);
        System.out.println("Số nhỏ nhất trong mảng là: "+min);

        //Tính trung bình cộng các phần tử có trong mảng
        int tongcacphantu=0;
/*        for(int i=0;i<nums.size();i++){
            tong+=nums.get(i);
            tongcacphantu++;
        }*/
        for (double num:nums) {
            tongcacphantu++;
        }
        double result=(double) tong/tongcacphantu;
        System.out.println("Giá trị trung bình các phần tử trong mảng là: "+result);
    }
}