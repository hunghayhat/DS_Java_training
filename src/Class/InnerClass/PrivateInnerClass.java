package Class.InnerClass;

class OuterClass1 {
    int x = 10;

//    private class InnerClass2 {
    static class InnerClass2 {
        int y = 15;
    }
}
public class PrivateInnerClass {
    public static void main(String[] args) {
//        OuterClass1 myOuter1 = new OuterClass1();
//        OuterClass1.InnerClass2 myInner2 = myOuter1.new InnerClass2(); // Private inner class => can't access
        OuterClass1.InnerClass2 myInner2 = new OuterClass1.InnerClass2();
        System.out.println(myInner2.y);
    }
}
