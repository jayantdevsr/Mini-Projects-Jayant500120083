interface A {
    void meth1();

    void meth2();
}

class MyClass implements A {
    @Override
    public void meth1() {
        System.out.println("Executing meth1 method: Welcome to MyClass!");
    }

    @Override
    public void meth2() {
        int result = performCalculation(5, 3); 
        System.out.println("Executing meth2 method: Result of calculation is " + result);
    }

    private int performCalculation(int a, int b) {
        return a + b; 
    }
}

public class code1 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.meth1();

        obj.meth2();
    }
}
