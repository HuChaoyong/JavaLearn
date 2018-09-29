package Chapter12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferdReaderDemo {

    public static void main(String[] args) {
//        demo1();
//        demo2();
        String name = "fasdf2333name";
        boolean s = name.matches("\\d");
        String r =name.replaceAll("\\d+", "Number");
        System.out.println(s);
        System.out.println(r);
    }

    public static void demo1() {
        BufferedReader buf = null;
        // System.in 是字节输入流
        // InputStreamReader 将字节流转变为字符流
        // BufferedReader 将字符流放到字符流缓冲区中
        buf = new BufferedReader(new InputStreamReader(System.in));
    }

    public  static void demo2() {
        BufferedReader buf = null;
        buf = new BufferedReader(new InputStreamReader(System.in));

        String str = null;
        System.out.println("请输入内容: ");
        try {
            str = buf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("输入的内容为： " + str);
    }
}