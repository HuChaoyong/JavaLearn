package Chapter13;

import java.util.*;

// 集合的输出
public class CollectionOutput {
    public static void main(String[] args) {
//        demo1();
//        demo2();
//        demo3();
//        demo4();

        demo5();
    }

    /**
     * 取出 Collection中的全部内容
     */
    public static void demo1() {
        List<String> all = new ArrayList<String>();
        all.add("Hello ");
        all.add("_");
        all.add("World");
        Iterator<String> iter = all.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next() + "、");
        }
    }

    /**
     * 删除指定内容
     */
    public static void demo2() {
        List<String> all = new ArrayList<String>();
        all.add("Hello ");
        all.add("_");
        all.add("World");
        Iterator<String> iter = all.iterator();

        while (iter.hasNext()) {
            String str = iter.next();
            if ("_".equals(str)) {
//                iter.remove();
                all.remove(str);
            } else {
                System.out.println(str + "、");
            }
        }

        System.out.println("删除后的集合： " + all);
    }

    /**
     * 向前或 向后遍历输出
     */
    public static void demo3() {
        List<String> all = new ArrayList<String>();
        all.add("Hello ");
        all.add("_");
        all.add("World");
        ListIterator<String> iter = all.listIterator();

        System.out.println("向后遍历");
        while (iter.hasNext()) {
            String str = iter.next();
            System.out.println(str + "、");
        }

        System.out.println("向前遍历");
        while (iter.hasPrevious()) {
            String str = iter.previous();
            System.out.println(str + "、");
        }

        System.out.println("删除后的集合： " + all);
    }

    /**
     * foreach
     */
    public static void demo4() {
        List<String> all = new ArrayList<String>();
        all.add("Hello ");
        all.add("_");
        all.add("World");
        Iterator<String> iter = all.iterator();

        for (String str: all) {
            System.out.println(str + "、");
        }
    }

    /**
     *  Enumeration demo， 这是一个旧的接口， 在早期的jdk的开发中会使用到
     */
    public static void demo5() {
        Vector<String> all = new Vector<String>(); // 只能使用 Vector!!!
        all.add("Hello");
        all.add("_");
        all.add("World");

        Enumeration<String> enu = all.elements(); // 实例化

        while (enu.hasMoreElements()) {
            System.out.println(enu.nextElement() + "、"); // 循环输出
        }

    }
}
