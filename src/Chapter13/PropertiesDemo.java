package Chapter13;

import java.io.*;
import java.util.Properties;

/**
 * Properties 类是 Hashtable 类的子类
 */

public class PropertiesDemo {
    public static void main(String[] args) {
//        demo1();
//        demo2();
//        demo3();
//        demo4();
        demo5();
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


    /**
     * 把属性文件保存
     */
    public static void demo2() {
        Properties pro = new Properties();
        pro.setProperty("BJ", "BeiJing");
        pro.setProperty("TJ", "TianJing");

        File file = new File("/home/hcy/temp/test.properties");

        // 保存到普通文件中
        try {
            pro.store(new FileOutputStream(file), "Area Info");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 从普通文件中读取属性文件
     */
    public static void demo3() {
        Properties pro = new Properties();
        File file = new File("/home/hcy/temp/test.properties");

        try {
            pro.load(new FileInputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("获取到的属性文件内容为： " + pro);
    }

    /**
     * 把属性文件保存文 xml 文件
     */
    public static void demo4() {
        Properties pro = new Properties();
        pro.setProperty("BJ", "BeiJing");
        pro.setProperty("CD", "ChengDu");

        File file = new File("/home/hcy/temp/test.xml");

        try {
            pro.storeToXML(new FileOutputStream(file), "info");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 从 xml 文件中读取属性
     */
    public static void demo5() {
        Properties pro = new Properties();
        File file = new File("/home/hcy/temp/test.xml");

        try {
            pro.loadFromXML(new FileInputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("从xml读取到的属性： " + pro);
    }
}
