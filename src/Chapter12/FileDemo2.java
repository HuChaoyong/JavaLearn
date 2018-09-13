package Chapter12;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        // 判断给定路径是否是目录

        File f = new File("/home/hcy/temp");
        if (f.isDirectory()) {
            System.out.println(f.getPath() + "路径是目录");
        } else {
            System.out.println(f.getPath() + "路径不是目录");
        }

        print(f);
    }

    // 遍历目录下的所有文件
    public static void print(File file) {
        if (file != null) {
            if (file.isDirectory()) {
                File[] f = file.listFiles();
                if (f != null) {
                    for (File fi:f ) {
                        print(fi);
                    }
                }
            } else {
                System.out.println(file);
            }
        }
    }
}
