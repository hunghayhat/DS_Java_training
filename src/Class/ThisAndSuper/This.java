package Class.ThisAndSuper;

public class This {
    int a = 10;
    static int b = 20;
    void test() {
        System.out.println(this.a);
        System.out.println(this.b);
    }

    public static void main(String[] args) {
        new This().test();
    }
}

