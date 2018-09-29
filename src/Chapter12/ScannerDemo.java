package Chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Scanner 输入实例
 */

public class ScannerDemo {
    public static void main(String[] args) {
//        demo1();
        demo2();
    }

    public static  void demo1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入数据: ");
        String str = scan.next();
        System.out.println("输入的是： " + str);
    }

    public static void demo2() {
        File f = new File("/home/hcy/temp/test.txt");
        Scanner scan = null;
        try {
            scan = new Scanner(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StringBuffer str = new StringBuffer();
        while (scan.hasNext()) {
            str.append(scan.next()).append("\n");
        }
        System.out.println("文件内容： ");
        System.out.println(str);
    }
}
