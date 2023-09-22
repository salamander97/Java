package ClassTrongJava;

public class ClassTrongJava {
    public static void main(String[] args) {
        Person a = new Person("Trung Hieu",23,168f);
        a.name= "Hieu";
        a.age=19;
        a.height= 1.78f;
        a.eat("Rice");
        int age=a.getAge();
        System.out.println("Age: "+age);

        //_2
        Person a1= new Person("Hieu",19,24f);
        a.eat("Rice");
        int age1=a.getAge();
        System.out.println(a.name+" "+age1+" year old!");

    }
}