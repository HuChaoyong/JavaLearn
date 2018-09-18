package Chapter12;

import java.io.*;

public class FileStreamSaveFile {
    public static void main(String[] args) throws Exception {

//        FileStreamSaveFile.saveFile("/home/hcy/temp/test.txt", "tttttssss \r\n");
//        FileStreamSaveFile.addContentOnFile("/home/hcy/temp/test.txt", "content1 \r\n");

//        FileStreamSaveFile.readFile("/home/hcy/temp/test.txt");
//        FileStreamSaveFile.saver("/home/hcy/temp/test.txt", "Hello World!!!", false);
//        FileStreamSaveFile.charReader("/home/hcy/temp/test.txt");

        cacheCheck();

    }

    // 输出流
    public static void saveFile(String path, String str) throws Exception {
        // 1. 使用File类找到一个文件
        File f = new File(path);
        // 2.第二步，通过子类实例化父类对象
        OutputStream out = new FileOutputStream(f);
        // 第三步 ， 写操作
        byte[] b = str.getBytes();
        // 输出内容，保存文件
        out.write(b);
        // 第四步，关闭输出流
        out.close();
    }

    // 输出流
    public static void addContentOnFile(String path, String content) throws Exception {
        // 1. 使用File类找到一个文件
        File f = new File(path);
        // 2.第二步，通过子类实例化父类对象
        OutputStream out = new FileOutputStream(f, true); // 这里的 true表示是在文件末尾增加内容
        // 第三步 ， 写操作
        byte[] b = content.getBytes();
        // 输出内容，保存文件
        out.write(b);
        // 第四步，关闭输出流
        out.close();
    }

    // 输入流
    public static void readFile(String path) throws Exception {
        // 1. 使用File类找到一个文件
        File f = new File(path);
        // 2.第二步，通过子类实例化父类对象
        FileInputStream input = new FileInputStream(f); // 这里的 true表示是在文件末尾增加内容
        // 第三步 ， 读操作
        int len = 0;
        byte[] b = new byte[1024];
        // 输出内容，保存文件

        int temp = 0;
        while ((temp = input.read()) != -1) {
            // 如果每次读取内容temp变量的值不是-1，表示内容没有读完
            b[len] = (byte) temp;
            len ++;
        }
        input.read(b);

        // 第四步，关闭输出流
        input.close();

        System.out.println("读取文件'" + path + "'的内容为： \r\n" + new String(b));
    }

    // 字符流输出

    /**
     * 字符流输出
     * @param path 文件路径
     * @param content 文件内容
     * @param isAppend 是否是追加内容
     * @throws Exception 抛出错误
     */
    public static void charSaver(String path, String content, boolean isAppend) throws Exception {
        // 1. 使用File类
        File f = new File(path);
        // 2. 通过子类实例化父对象
        Writer out = new FileWriter(f);
        // 3. 进行写操作
        out.write(content); // 将内容输出
        // 4. 关闭输出流
        out.close();
    }

    /**
     * 字符流读取
     * @param path 文件路径
     * @throws Exception 错误
     */
    public static void charReader(String path) throws Exception {
        // 1. 使用File类
        File f = new File(path);
        // 2. 通过子类实例化父对象
        Reader reader = new FileReader(f);
        // 3. 进行写操作
        int len = 0;
        char[] c = new char[1024];
        int temp = 0;
        while ((temp = reader.read()) != -1) {
            // 将每次读到的内容给temp
            c[len] = (char) temp;
            len ++;
        }
        // 4. 关闭输出流
        reader.close();

        System.out.println("获取文件‘" + path + "'内容： \r\n" + new String(c, 0, len));
    }

    public static void cacheCheck() throws Exception {
        File f = new File("/home/hcy/temp/test.txt");
        Writer out = new FileWriter(f);
        String str = "Hello LXH . . .";
        out.write(str);
        out.flush(); // 强制清空缓冲区内容
//        out.close();
    }
}
