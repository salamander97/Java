package GetterVaSetter.Test;

public class Test {
    public static void main(String[] args) {
        MyDate md = new MyDate(31,5,-2021);
        System.out.println("Day = "+md.getDay()+" Month = "+md.getMonth()+" Year = "+md.getYear());
        md.setDay(32);
        md.setMonth(2);
        md.setYear(2023);
        System.out.println("Day = "+md.getDay()+" Month = "+md.getMonth()+" Year = "+md.getYear());

    }
}
