package Chapter13;

import java.util.*;

/**
 * Map 接口， Key => Value
 */

public class MapDemo {
    public static void main(String[] args) {
        demo1();
        demo2();
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
}
