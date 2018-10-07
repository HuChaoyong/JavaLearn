package Chapter12;

import java.io.*;

public class CodeFormatDemo {
    public static void main(String[] args) {
        demo1();
    }

    public static void demo2() {
        System.out.println("系统默认编码： " + System.getProperty("file.encoding"));
    }

    /**
     * 乱码测试， JVM默认是 utf-8， 保存用 GB2312，就会乱码
     */
    public static void demo1() {
        File f = new File("/home/hcy/temp/codeFormat.txt");
        OutputStream out = null;
        try {
            out = new FileOutputStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            byte[] b = "中国， 你好！".getBytes("GB2312");
//            byte[] b = "中国， 你好！".getBytes("ISO8859-1");
            out.write(b);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
