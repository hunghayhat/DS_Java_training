package Class.SingletonClass;

class SimpleSingleton {
    // Tạo một đối tượng duy nhất của lớp SimpleSingleton
    private static SimpleSingleton instance;

    // Constructor private để ngăn việc tạo đối tượng từ bên ngoài
    private SimpleSingleton() {}

    // Phương thức để lấy đối tượng duy nhất
    public static SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton(); // Tạo đối tượng nếu chưa tồn tại
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello, this is the Singleton instance!");
    }
}

 public class Main {
    public static void main(String[] args) {
        // Lấy đối tượng duy nhất từ Singleton
        SimpleSingleton singleton = SimpleSingleton.getInstance();

        // Gọi phương thức của Singleton
        singleton.showMessage();
    }
}

