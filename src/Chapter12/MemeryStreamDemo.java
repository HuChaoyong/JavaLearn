package Chapter12;

// 内存操作流

import java.io.*;

/**
 *   ByteArrayInputStream 主要完成将内容写入到内存中
 *
 *   ByteArrayOutputStream 主要是将内存中的数据输出
 */


public class MemeryStreamDemo {
    public static void main(String[] args) {
        convert("HELLO World!");
    }

    // UpCase to lowCase
    public static  void convert(String word) {
        ByteArrayInputStream bis = null;
        ByteArrayOutputStream bos = null;

        // 向内存中输出内容
        bis = new ByteArrayInputStream(word.getBytes());
        // 准备从 ByteArrayOutputStream 中读取数据
        bos = new ByteArrayOutputStream();

        int temp = 0;
        while ((temp = bis.read()) != -1) {
            char c = (char) temp;
            // 转换成小写
            bos.write(Character.toLowerCase(c));
        }
        // 提取出内容
        String newStr = bos.toString();

        System.out.println(newStr);

        try {
            bis.close();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
