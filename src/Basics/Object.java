package Basics;

public class Object {
    public static void myMethod(String fname) {
        System.out.println("Nguyễn " + fname);
    }

    static void checkAge(int age) {
        if (age < 18)
            System.out.println("Nhót!");
        else
            System.out.println("Ok!");
    }


    public static void main(String[] args) {
        myMethod("Thế Hưng");
        myMethod("Cường");
        myMethod("Minh Quang");

        checkAge(16);

        System.out.println(plusMethod(5, 7));
        System.out.println(plusMethod(5.5d, 7.5d));

        System.out.println(sum(5)); // Test recursion's output

    }

    //Overload: Nạp chồng phương thức: các hàm có thể có cùng tên nhưng các tham số khác nhau
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    // Đệ quy - Recursion
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else return 0;
    }

    public static int sum_2(int start, int end) {
        if (end > start)
            return end + sum_2(start, end - 1);
        else return end;
    }

}
