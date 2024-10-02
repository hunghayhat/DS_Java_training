package Basics;

public class OOP {

    // static and public method:
    static void test1() {
        System.out.println("Hello world!");
    }

    public void test2() {
        System.out.println("Bye world!");
    }

    public static void main(String[] args) {
        test1();
//      test2(); -> Chưa khởi tạo đối tượng => lỗi
        OOP obj = new OOP();
        obj.test2();
        Object test = new Object();
        test.myMethod("Hung");
    }


}
