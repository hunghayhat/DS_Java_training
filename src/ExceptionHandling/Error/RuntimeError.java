package ExceptionHandling.Error;

public class RuntimeError {
    public static void main(String[] args) {
        StackOverFlow.test(5);
    }
}

class StackOverFlow {
    public static void test (int i){
        if (i == 0) return;
        else test(i++);
    }
}

