package Class.ThisAndSuper;

public class Super {
    int a = 10;
    static int b = 20;
}

class Base extends Super {
    void test() {
        System.out.println(super.a);
        System.out.println(super.b);
    }

    public static void main(String[] args) {
        new Base().test();
    }
}
