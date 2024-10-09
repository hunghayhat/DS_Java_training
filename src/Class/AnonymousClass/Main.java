package Class.AnonymousClass;

public class Main {
    public static void main(String[] args) {
        // Sử dụng Anonymous Class để tạo một đối tượng của lớp cha mà không cần định nghĩa lớp con
        Animal animal = new Animal() {
            @Override
            public void sound() {
                System.out.println("Meow! This is an anonymous class.");
            }
        };

        // Gọi phương thức sound()
        animal.sound();
    }
}

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

