package Chapter6;

// 抽象类中含有接口, 如何实现接口
abstract class IA {
    public abstract void printIA();
    interface IB {
        public void printIB();
    }
}

class XA extends IA {
    public void printIA() {
        System.out.println("打印IA");
    }

    class XAY implements IB {
        public void printIB() {
            System.out.println("打印IB");
        }
    }
}

interface TA {
    public abstract void printIA();
    abstract class TB {
        public abstract void printIB();
    }
}

class GX implements TA {
    public void printIA() {
        System.out.println("打印 GX => IA");
    }

    class GXY extends TB {
        public void printIB() {
            System.out.println("打印 GXY => TB");
        }
    }
}

public class InnerClassExtends {
    static {
        IA.IB b = new XA().new XAY(); // ????? 这个写法 ????
        b.printIB();
    }
    public static void main(String[] args) {
        TA.TB b = new GX().new GXY();
        b.printIB();
    }
}
