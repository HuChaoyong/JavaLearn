package Chapter12;
import java.io.*;

public class FileDemo3 {
    public static void main(String[] args) throws Exception {
//        saveCharToString("/home/hcy/temp/saveCharToString.txt", "字节流转换为字符流保存");

        readCharAsString("/home/hcy/temp/saveCharToString.txt");

    }

    // 转换流， OutputStreamWriter 类 与 InputStreamReader 类

    // OutputStreamWriter 将输出的字符流变为字节流，
    // InputStreamReader 将输入的字节流变为字符流

    // 将字节流转换成字符流保存
    public static void saveCharToString(String path, String content) throws Exception {
        File f = new File(path);
        Writer out = null;
        // 将字节流转换为字符流
        out = new OutputStreamWriter(new FileOutputStream(f));
        out.write(content);
        out.close();
    }


    public static void readCharAsString(String path) throws Exception {
        File f = new File(path);
        Reader input = null;
        input = new InputStreamReader(new FileInputStream(f));
        int temp = 0;
        StringBuffer str = new StringBuffer();
        while ((temp = input.read()) != -1) {
            str.append(Character.toChars(temp));
        }
        System.out.println(str);
        input.close();
    }

}
