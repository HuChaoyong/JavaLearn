package Chapter12;
import java.io.*;

/**
 * 打印流；
 *   打印流是输出信息最方便的类.
 *
 *   主要包含： 字节打印流 PrintStream 和 字符打印流  PrintWriter
 *
 *   演示使用 PrintWriter
 */

public class PrintStreamDemo {
    public static void main(String[] args) {
        Demo1();
        Demo2();
    }

    // Use Print Stream
    public static void Demo1() {
        PrintStream ps = null;
        // 此时通过FIleOutputStream实例化， 意味着所有的输出是向文件中打印
        // 所有打印的东西，都会写入到文件
        try {
            ps = new PrintStream(new FileOutputStream((new File("/home/hcy/temp/PrintStreamDemo.txt"))));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ps.print("Hello ");
        ps.println(" world !!!");
        ps.print("1 + 1 = " + 2);
        ps.close();
    }

    // print format
    public static void Demo2() {
        PrintStream ps = null;
        try {
            ps = new PrintStream(new FileOutputStream((new File("/home/hcy/temp/PrintStreamFormatDemo.txt"))));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String name = "李兴华";
        int age = 30;
        float score = 990.356f;
        char sex = 'M';
        // 格式化输出

        ps.format("姓名: %s; 年龄: %d; 成绩: %f; 性别: %c", name, age, score, sex);
        ps.close();
    }
}
