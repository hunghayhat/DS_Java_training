package Basics;

public class DataType {
    public static void main(String[] args) {
        int a = 5;
        float b = 9.5f;
        double c = 90809.33;
        char ab = 5;

        System.out.println(b);
        System.out.println("ab * b = "+ ab*b);

        int maxScore = 500;
        int userScore = 400;

        float percentage = (float) userScore / maxScore * 100.0f;
        System.out.println("User's percentage is: " +percentage +"%");

        //Lỗi chính xác của double:
        double value1 = 0.1;
        double value2 = 0.2;
        double sum = value1 + value2;
        System.out.println("Sum of 0.1 + 0.2 with Double: " + sum);  // 0.30000000000000004

        //String
        String firstName = "Hung ";
        String lastName = "Nguyen";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        System.out.println(fullName.indexOf("un"));
        System.out.println(firstName.concat(lastName));
    }
}
