package Chapter12;

import java.io.*;
import java.util.*;
import java.util.zip.*;


public class ZipDemo {
    public static void main(String[] args) {
        demo1();
    }

    /**
     * 压缩  order.txt文件到 order.zip
     */
    public static void demo1() {
        File file = new File("/home/hcy/temp/order.txt");
        File zipFile = new File("/home/hcy/temp/order.zip");
        InputStream input = null;
        try {
             input = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ZipOutputStream zipOut = null;
        try {
            zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            zipOut.putNextEntry(new ZipEntry(file.getName()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        zipOut.setComment("www.abc.cn");

        int temp = 0;
        try {
            while ((temp = input.read()) != -1) {
                zipOut.write(temp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            input.close();
            zipOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
