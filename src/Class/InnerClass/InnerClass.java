package Class.InnerClass;

class OuterClass {
    int x = 10;

    class InnerClass1 {
        int y = 5;
    }
}

public class InnerClass {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass1 myInner1 = myOuter.new InnerClass1();
        System.out.println(myInner1.y + myOuter.x);
    }
}
