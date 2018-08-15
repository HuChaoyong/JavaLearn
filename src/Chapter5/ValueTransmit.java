package Chapter5;

class Demo {
    public int a = 0;
    public String b = "hcy";

    public String toString() {
        return "b=" + b + ", a=" + a;
    }

    public String test() {
        System.out.println("this =" + this);
        return null;
    }

    public void g(Demo d) {
        d.b = "2233333";
    }
}


/**
 * 传值和传地址的Demo, 只要是传进去的是  引用对象,那么,修改后就会是修改引用对象的值,
 * 如果是 值类型,那么,就会 copy 一个值,而不是操作源属性,
 * 这一点和 JS 里面是一样的
 */

public class ValueTransmit {


    public static void main(String[] args) {
        Demo d1 = new Demo();


//        ValueTransmit.funStr(d1.b);
//        ValueTransmit.fun(d1);
        d1.test();

//        System.out.println(d1.toString());
    }

    public static void fun(Demo d2) {
        d2.b = "change";
    }

    public static void funStr(String str) {
        str = "strChange";
    }
}
