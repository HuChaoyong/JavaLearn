package Chapter5;

/**
 * 单例的设计模式实现,
 *  应用了 static 变量只有一个的特性
 */

class Singleton {

    private static Singleton  instance = new Singleton();

    public static Singleton getSingleton() {
        return Singleton.instance;
    }
    // 把构造函数私有化,无法通过外部new来创建实例,就只能存在一个 实例,就是 instance
    private Singleton() { }
}

public class SingleInstance {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleton();
    }
}
