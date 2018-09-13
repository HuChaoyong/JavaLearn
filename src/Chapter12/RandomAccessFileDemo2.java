package Chapter12;

import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo2 {
    public static void main(String[] args) throws Exception {
        File f = new File("/home/hcy/temp/Random.txt");

        RandomAccessFile rdf = null;
        rdf = new RandomAccessFile(f, "r");

        String name = null;
        int age = 0;
        byte[] b = new byte[8]; // 准备空间读取姓名
        rdf.skipBytes(12);
        for (int i = 0; i < b.length; i++) {
            b[i] = rdf.readByte();
        }

        name = new String(b);
        age = rdf.readInt();

        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
}
