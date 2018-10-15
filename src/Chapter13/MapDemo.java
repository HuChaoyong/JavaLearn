package Chapter13;

import java.sql.SQLSyntaxErrorException;
import java.util.*;

/**
 * Map 接口， Key => Value
 */

public class MapDemo {
    public static void main(String[] args) {
//        demo1();
//        demo2();
//        demo3();
//        demo4();
//        demo5();
//        demo6();
//        demo7();
//        demo8();
        demo9();
    }

    /**
     *  HashMapDemo1
     */
    public static void demo1() {
        Map<String, String> map = null;
        map = new HashMap<String, String>();

        map.put("mldns", "www.land-aaa.com");
        map.put("zhisdfa", "233333");
        map.put("wangzhihuan", "ruanzeyuan");

        String val = map.get("mldns"); // 根据 key 获取到 value

        System.out.println("获取key为 mldns的value: " + val);
    }

    /**
     * 判断 指定内容是否存在
     */
    public static void demo2() {
        Map<String, String> map = null;
        map = new HashMap<String, String>();

        map.put("mldns", "www.land-aaa.com");
        map.put("bili", "233333");
        map.put("lol", "ruanzeyuan");


        System.out.println("该Map集合包含key为mldns的数据吗 ？ " + map.containsKey("mldns"));

        Set<String> keys = map.keySet();
        Iterator<String> iter = keys.iterator();


        System.out.println("遍历key: ");
        while (iter.hasNext()) {
            String str = iter.next();
            System.out.println(str + "、");
        }


        Collection<String> values = map.values();
        Iterator<String> iter2 = values.iterator();

        System.out.println("\n 遍历value");

        while (iter2.hasNext()) {
            String str = iter2.next();
            System.out.println(str + "、");
        }
    }

    /**
     * 旧的子类， HashMap,
     *  HashMap也是Map的一个子类，与 Vector类的推出时间一样，都属于旧的操作类，
     */
    public static void demo3() {
        Map<String, String> map = null;
        map = new HashMap<String, String>();

        map.put("mlds", "www.mldn.csm");
        map.put("zhifs", "www.zhihu.com");
        map.put("mldnJava", "www.mldn.com");

        Set<String> keys = map.keySet(); // 获取所有的keys
        Iterator<String> iter1 = keys.iterator();

        System.out.println("全部的Key: ");
        while (iter1.hasNext()) {
            String str = iter1.next();
            System.out.println(str + "、");
        }

        Collection<String> values = map.values();
        Iterator<String> iter2 = values.iterator();

        System.out.println("\n 全部的 value: ");
        while (iter2.hasNext()) {
            String str = iter2.next();
            System.out.println(str + "、");
        }
    }

    /**
     * 注意！！！ 使用 TreeMap 的自定义类，一定要实现 Comparable 接口
     */
    public static void demo4() {
        Map<String, String> map = null;
        map = new TreeMap<String, String>();

        map.put("C, 11", "www.mldn.com");
        map.put("A, ifad", "www.mldn.csm");
        map.put("B, 22233", "www.zhihu.com");

        Set<String> keys = map.keySet();
        Iterator<String> iter = keys.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            System.out.println( str + " ===> "  + map.get(str));
        }
    }

    /**
     * 弱引用类  WeakHashMap,
     */
    public static void demo5() {
        Map<String, String> map = null;
        map = new WeakHashMap<String, String>();

        map.put(new String("C, 11"), new String("www.mldn.com"));
        map.put(new String("A, ifad"), new String("www.mldn.csm"));
        map.put(new String("B, 22233"), new String("www.zhihu.com"));

        System.gc();

        map.put(new String("lxh"), new String("aaa"));

        System.out.println("内容: " + map);
    }

    /**
     * 使用 Map.Entry 输出 key 和 value  !  这个是基本操作，非常重用！！！！
     */
    public static void demo6() {
        Map<String, String> map = null;
        map = new HashMap<String, String>();

        map.put("mlds", "www.mldn.csm");
        map.put("zhifs", "www.zhihu.com");
        map.put("mldnJava", "www.mldn.com");

        Set<Map.Entry<String, String>> allSet = null; // 声明集合， 指定泛型

        allSet = map.entrySet(); // Map接口实例编程 Set接口实例

        Iterator<Map.Entry<String, String>> iter = allSet.iterator();

        while (iter.hasNext()) {
            Map.Entry<String, String> item = iter.next();
            // 输出 Key  和  Value
            System.out.println(item.getKey() +  "----> " + item.getValue());
        }
    }

    /**
     * 用 foreach 遍历实体， 和上面的功能一样，但是，非常方便啊有木有
     */
    public static void demo7() {
        Map<String, String> map = null;
        map = new HashMap<String, String>();

        map.put("mlds", "www.mldn.csm");
        map.put("zhifs", "www.zhihu.com");
        map.put("mldnJava", "www.mldn.com");

        for (Map.Entry<String, String> item: map.entrySet()) {
            System.out.println(item.getKey() + "----> " + item.getValue());
        }
    }


    /**
     * 如果要用 <String, Person> 这样的 key => value 是没问题的， 因为 系统的 String 实现了 equals 和 hashCode 接口
     * 如果要用 <Person, String> 这样的 key => value 的话， 如果 Person 没有 equals 和 hashCode 那么， put 时是什么对象，
     *  get 时，就仍然要用那个对象， 不能重新 new 新的相同属性的对象， 因为它不能判断2个对象是否相等,
     *  如果实现了 equales和 hashCode ，就可以使用 new 新的对象，来get,
     */
    public static void demo8() {
        Map<Person, String> map = null;
        map = new HashMap<Person, String>();

        Person per = new Person("张三", 30);

        map.put(per, "zhangsan");
        System.out.println(map.get(per));

        System.out.println(map.get(new Person("张三", 30)));
    }

    public static void demo9() {
        SortedMap<String, String> map = null;
        map = new TreeMap<String, String>();
        map.put("D、 Jiangker", "http://jiang.com");
        map.put("C、 玩蛇", "夹心酱");
        map.put("B、 mldnjava", "走你");

        System.out.print("第一个元素对应的key: " + map.firstKey());
        System.out.println("；对应的值： " + map.get(map.firstKey()));

        System.out.print("最后一个元素的可以： " + map.lastKey());
        System.out.println("对应的值： " + map.get(map.lastKey()));

        System.out.println("返回小于指定范围的集合： ");
        for (Map.Entry<String, String> item: map.headMap("C、 玩蛇").entrySet()) {
            System.out.println("\t | -" + item.getKey() + " ===> " + item.getValue());
        }
    }

}

