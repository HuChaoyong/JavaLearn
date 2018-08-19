package Chapter6;

/**
 * 装箱与拆箱
 */

public class BoxingAndUnboxing {
    public static void main(String[] args) {
        int x = 30;         // 声明基本数据类型
        Integer i = new Integer(x); // 装箱
        int temp = i.intValue(); // 拆箱

        Integer a = 30; // 自动装箱为 Interger
        Float b = 30.31f; //自动装箱 Float
        int c = a; // 自动拆箱为int
        float d = b; // 自动拆箱为float
    }
}
