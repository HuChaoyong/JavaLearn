package Chapter5;

/**
 * 使用内部类
 */

class Outer {
    private static String info = "hello world";

    static class Inner {
        public void print() {
            System.out.println(info);
        }
    }


    public void fun2(int temp) {
        class AInner {
            public void print() {
                System.out.println("方法中的类的打印:" + temp);
            }
        };
        AInner a = new AInner();
        a.print();
    }
}

public class OuterInner {
    public static void main(String[] args) {
        Outer a = new Outer();
        a.fun2(2333);
        Outer.Inner b = new Outer.Inner();
        b.print();
    }
}
