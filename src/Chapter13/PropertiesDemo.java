package Chapter13;

import java.util.Properties;

/**
 * Properties 类是 Hashtable 类的子类
 */

public class PropertiesDemo {
    public static void main(String[] args) {
        demo1();
    }

    public static void demo1() {
        Properties pro = new Properties();
        pro.setProperty("BJ", "BeiJing");
        pro.setProperty("TJ", "TianJing");

        System.out.println("BJ属性存在 ： " + pro.getProperty("BJ"));
        System.out.println("SC属性不存在： " + pro.getProperty("SC"));
        // 如果没有找到 key对应的value，那么就返回默认值 “未找到"
        System.out.println("不存在的属性，并设置默认值：" + pro.getProperty("SC", "未找到"));

        System.out.println(pro);
    }
}
