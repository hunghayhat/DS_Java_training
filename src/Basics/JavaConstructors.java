package Basics;

public class JavaConstructors {
    int x;

    // tạo class constructor cho class JavaConstructors
    public JavaConstructors(){
        x = 5;
    }

    public static void main(String[] args) {
        JavaConstructors myObj = new JavaConstructors();
        System.out.println(myObj.x);
    }
}
