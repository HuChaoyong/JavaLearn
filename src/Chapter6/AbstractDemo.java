package Chapter6;

abstract class A {
    private String name = "aaa";
    public A() {
        System.out.println("父类中的构造方法!");
    }
}

class B extends A {
    public B() {
        System.out.println("子类中的构造方法!");
    }
}


public class AbstractDemo {
    public static void main(String[] args) {
        B b = new B();
    }
}
