package Chapter13;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
//        demo1();
//        demo2();
        demo3();
    }


    /**
     *  Collectons 类中可以返回的 List、Set、Map集合， 但是，返回的对象是无法进增加数据的
     */
    public static void demo1() {
        List<String> allList = Collections.emptyList();

        Set<String> allSet = Collections.emptySet();

//        allList.add("Hello");
    }

       public static void demo2() {
        List<String> allList = new ArrayList<String>();

        Collections.addAll(allList, "MLDN", "LXH", "MDLJAva");

        Iterator<String> iter = allList.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next() + "、");
        }

    }

    /**
     * 反转内容
     */
    public static void demo3() {
        List<String> all = new ArrayList<String>();
        Collections.addAll(all, "aaaMLDN", "bbbLXH", "cccMDLJAva");

        Collections.reverse(all);
        Iterator<String> iter = all.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next() + "、");
        }

        System.out.println("二分法检索结果： " + Collections.binarySearch(all, "cccMDLJAva"));

        // 替换内容
        Collections.replaceAll(all, "bbbLXH", "李兴华");

        System.out.println(all);

        // 集合排序， 要求集合中的对象必须实现 Comparable 接口

        Collections.sort(all);
        System.out.println("排序后： " + all);

        // 交换指定 索引位置的内容
        Collections.swap(all, 0, 2);

        System.out.println("交换0 ， 2 位置后： ");
        System.out.println(all);
    }

    public static void demo4() {

    }


}
