package Chapter13;
import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        ArrayListDemo1();
        ArrayListDemo2();
        ArrayListDemo3();
        ArrayListDemo4();
        ArrayListDemo5();
    }

    public static void ArrayListDemo1() {
        List<String> allList = null;
        Collection<String> allCollection = null;

        allList = new ArrayList<String>();
        allCollection = new ArrayList<String>();

        allList.add("Hello");
        allList.add(0, "World");
        System.out.println(allList);

        allCollection.add("LXH");
        allCollection.add("www.mdsda.com");
        allList.addAll(allCollection);
        allList.addAll(0, allCollection);
        // 从index为0的前面插入. 相当于js的  ...arr,用来添加数组到数组前面

        System.out.println(allList);
    }

    // 删除操作
    public static void ArrayListDemo2() {
        List<String> allList = null;
        allList = new ArrayList<String>();

        allList.add("Hello");
        allList.add(0, " World");
        allList.add(" 23333");
        allList.add("  Ya");

        allList.remove(0); // 移除指定位置的元素
        allList.remove("Hello"); // 删除指定的内容
        // 使用 remove(Object o) 时，需要覆写 equals() 和 hasCode() 这两个方法

        System.out.println(allList);
    }

    // 遍历
    public static void ArrayListDemo3() {
        List<String> allList = null;
        allList = new ArrayList<String>();

        allList.add("Hello");
        allList.add("Hello");
        allList.add(0, "World");
        for (int i = 0; i < allList.size(); i++) {
            System.out.print(allList.get(i) + "、");
        }
        System.out.println("");
    }
    public static void ArrayListDemo4() {
        List<String> allList = null;
        allList = new ArrayList<String>();

        allList.add("Hello");
        allList.add("Hello");
        allList.add(0, "World");
        allList.add("Nice");
        for (int i = 0; i < allList.size(); i++) {
            System.out.print(allList.get(i) + "、");
        }

        System.out.println("");
        Object[] obj = allList.toArray();
        for (int i = 0; i < obj.length; i++) {
            String temp = (String) obj[i];
            System.out.print(temp + "、");
        }
    }
    public static void ArrayListDemo5() {
        List<String> allList = null;
        allList = new ArrayList<String>();

        allList.add("Hello");
        allList.add("23333");
        allList.add(0, "World");
        allList.add("Nice");
        allList.add("Boy");

        System.out.println("");
        System.out.println("集合是否为空？ " + allList.isEmpty());
        System.out.println("包含 'Hello' 字符 ？" + allList.contains("Hello"));
        List<String> allSub = allList.subList(1, 3);
        System.out.println("截取 1-3： " + allSub);
        System.out.println("World 字符串所在位置： " + allList.indexOf("World"));
    }
}
