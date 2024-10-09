package Class.Encapsulation;

public class EncapsulationTest {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        // obj.name = "Messi"; Không truy cập được biến private
        obj.setName("Messi");
        String a = obj.getName();
        System.out.println(a);
    }
}
