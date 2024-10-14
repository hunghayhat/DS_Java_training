package ExceptionHandling.Exception;

public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            int data = 69/0;
        } catch (NullPointerException e){
            System.out.println(e); // không nhận output
        } catch (ArithmeticException ex){
            System.out.println(ex);
        } finally {
            System.out.println("Test"); // khối code luôn được thực thi => thoát ra khỏi khối try-catch-finally
        }
        System.out.println("Final test");
    }
}
