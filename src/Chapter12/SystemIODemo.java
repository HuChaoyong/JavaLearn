package Chapter12;

import org.omg.PortableInterceptor.INACTIVE;

import java.io.*;
import java.sql.SQLSyntaxErrorException;

//　使用　OutputStream向屏幕上输出

public class SystemIODemo {
    public static void main(String[] args) {
//        demo1();
//        SystemErr();
//        systemIn();
//        demo2();

//        redirectOutStreamDemo("/home/hcy/temp/redirectionTest.txt");
//        redirctErrorOutStream("/home/hcy/temp/redirectSaveError.txt");

//        systemErrRedirct();

        systemInRedirect("/home/hcy/temp/systemInRedirect.txt");
    }

    public static void demo1() {
        OutputStream out = System.out;

        try {
            // 输出到屏幕
            out.write("hello world!!!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 这里吧 out关闭后，后面调用的 System.out 也会受到影响
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // 打印error
    public static void systemErr() {
        String str = "hello";

        try {
            System.out.println(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            System.err.println(e);
        }
    }

    //  简单输入
    public static void systemIn() {
        InputStream input = System.in;
        byte[] b = new byte[1024];
        System.out.print("请输入内容：");
        int len = 0;
        try {
            len = input.read(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("输入内容为： " + new String(b, 0, len));
        try {
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // 不指定数组长度测试
    public static void demo2() {
        InputStream input = System.in;
        StringBuffer buf = new StringBuffer();

        System.out.println("请输入： ");

        int temp = 0;
        try {
            // 循环读取
            // 因为是一个字节一个字节读取，读取英文不会出问题，但是，中文的话，就会出现乱码，因为一个汉字由2个字节表示
            while ((temp = input.read()) != -1) {
                char c = (char) temp;
                // 按 enter表示退出
                if (c == '\n') {
                    break;
                }
                buf.append(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("输入的内容为： " + buf);

        try {
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 重定向输出流
     * @param path 指定输出路径(文件)
     */
    public static void redirectOutStreamDemo(String path) {
        try {
            System.setOut(new PrintStream(new FileOutputStream(path)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("www.lman-info.cn");
        System.out.println("www.了李兴华");
    }

    /**
     * 重定向错误输出流，  ！！！ 输出错误日志！！！ 原来如此
     * @param path
     */
    public static void redirctErrorOutStream(String path) {
        String str = "hello";

        try {
            System.out.println(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            try {
                // 重定向输出流,到文件
                System.setOut(new PrintStream(new FileOutputStream(path)));
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }
            // 保存到文件中
            System.out.println(e);
        }
    }

    /**
     * System.err 重定向
     */
    public static void systemErrRedirct() {
        ByteArrayOutputStream bos = null;
        bos = new ByteArrayOutputStream();

        try {
            // 输出重定向
            System.setErr(new PrintStream(bos));
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 输出重定向
        System.err.print("www.fasdjava.cn");
        System.err.print(", 李兴华");

        System.out.println(bos); // 打印错误信息
    }

    /**
     * 重定向输入 （读取文件）
     * @param path 文件路径
     */
    public static void systemInRedirect(String path) {
        // 设置重定向
        try {
            System.setIn(new FileInputStream(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // 接收数据
        InputStream input = System.in;
        byte[] b = new byte[1024];
        int len = 0;
        try {
            len = input.read(b);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("输入内容为： " + new String(b, 0, len));

        try {
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
