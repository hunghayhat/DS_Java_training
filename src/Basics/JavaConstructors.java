package Basics;

public class JavaConstructors {
    int user_year;
    String user_name;


    // tạo class constructor cho class JavaConstructors
    public JavaConstructors(String name, int year){
        user_name = name;
        user_year = year;
    }

    public static void main(String[] args) {
        JavaConstructors myObj = new JavaConstructors("Hưng", 2002);
        System.out.println(myObj.user_name + " sinh năm: " + myObj.user_year);
    }
}
