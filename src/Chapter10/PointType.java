package Chapter10;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * 泛型的基础用法,比如一个点类
 */


class Point<T> {
    public T getX() {
        return x;
    }

    public Point () {}
    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    private  T x;
    private  T y;
}

/**
 * 设定多个泛型类型
 */

class NotePad<K, V> {
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    private K key;
    private V value;
}

public class PointType {
    public static void main(String[] args) {
        Point<Integer> p = new Point<Integer>();
        int x = p.getX();
        int y = p.getY();
        System.out.println("Integer表示, X=" + x + ", Y=" + y);

        fun(p);

        NotePad<String, Integer> t1 = new NotePad<String, Integer>();
        t1.setKey("李兴华");
        t1.setValue(32);
        System.out.println("获取 Key = " + t1.getKey() + ", Value = " + t1.getValue());
    }

    // 如果在指定泛型参数可以任意匹配的时候,要用  ?  , 或者 不用泛型.
    // 虽然 Object是所有类的父类, 但是,也无法传递
    public static void fun(Point temp) {
        System.out.println("打印" + temp.getX());
    }
}
