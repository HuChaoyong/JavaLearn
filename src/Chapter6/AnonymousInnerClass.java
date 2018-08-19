package Chapter6;

/**
 * 匿名内部类
 */

interface AA {
    public void printInfo();
}

class XX {
    public void fun1() {
        // 神奇的是在这个地方, interface 居然可以 new ?? 而且,还可以给函数 ??? 喵喵喵 ?
        // 这种情况,适合于只使用一次某个对象类, 但是,又不想实例化这个类时
        this.fun2(new AA() {
            public void printInfo() {
                System.out.println("打印");
            }
        });
    }

    public void fun2(AA a) {
        a.printInfo();
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        new XX().fun1();
    }
}
