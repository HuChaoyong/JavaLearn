package Chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
        // 抛出异常，
    public static void main(String[] args) throws Exception {
        File f = new File("/home/hcy/temp/Random.txt");
        RandomAccessFile rdf = null;
        rdf = new RandomAccessFile(f, "rw");

        String name = null;
        int age = 0;
        name = "zhangsan"; // 字符串长度为8
        age = 30;
        rdf.writeBytes(name);
        rdf.writeInt(age);

        name = "lisi";
        age = 31;
        rdf.writeBytes(name);
        rdf.writeInt(age);

        name = "wangwu";
        age = 32;
        rdf.writeBytes(name);
        rdf.writeInt(age);


        // 关闭文件
        rdf.close();
    }
}
