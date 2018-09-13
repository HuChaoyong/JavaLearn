package Chapter12;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileDemo1 {
    public static void main(String[] args) {

        // 创建一个文件
/*        File f = new File("/home/hcy/temp/test.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        // 删除一个文件
        File fd = new File("/home/hcy/temp/test.txt");
        if (fd.exists()) {
            fd.delete();
        }

        // 创建文件夹
        File fs = new File("/home/hcy/temp/nnnnn");
        if (!fs.exists()) {
            fs.mkdir();
        }

        // 列出文件夹下的所有文件
//        File fc = new File("/home/hcy/temp");
//        String[] paths = fc.list();
//        for (String path: paths) {
//            System.out.println(path);
//        }

        // 列出文件夹下每个文件的完整路径
        File ff = new File("/home/hcy/temp");
        File[] files = ff.listFiles();
        for (File file: files) {
            System.out.println(file);
        }

        // 判断该使用哪种路径符号
        System.out.println("pathSeparator: " + File.pathSeparator);
        System.out.println("separator: " + File.separator);
    }
}
