package Chapter12;

import java.io.*;

/**
 * 实现 Java Copy 命令
 *  Copy 源文件 目标文件
 */

public class Copy {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("请输入正确的参数：java Copy 源文件地址 目标文件地址");
            System.exit(1);
        }

        File sourceFile = new File(args[0]);
        File targetFile = new File(args[1]);
        if (!sourceFile.exists()) {
            System.out.println("输入的源文件不存在，请检查文件是否存在！");
            System.exit(1);
        }
        if (sourceFile.isDirectory()) {
            System.out.println("输入的路径为目录，请输入文件路径！");
            System.exit(1);
        }
        FileInputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            inputStream = new FileInputStream(sourceFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            fileOutputStream = new FileOutputStream(targetFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int temp = 0;

        try {
            while((temp=inputStream.read()) != -1) {
                fileOutputStream.write(temp);
            }
            System.out.println("复制成功！");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("复制失败！");
        }

        try {
            inputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
