package Chapter12;

import java.io.*;

public class DataOutputDemo {
    public static void main(String[] args) {
//        demo1();
        demo2();
    }

    /**
     * 将订单数据写入 order.txt, 写入后的内容不正确
     */
    public static  void demo1() {
        DataOutputStream dos = null;
        File f = new File("/home/hcy/temp/order.txt"); // 指定文件保存路径
        try {
            dos = new DataOutputStream(new FileOutputStream(f));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String[] names = {"衬衣", "手套", "围巾"};
        float[] prices = {98.3f, 30.3f, 50.5f};
        int[] nums = {3, 2, 1};
        for (int i = 0; i < names.length; i++) {
            try {
                dos.writeChars(names[i]);
                dos.write('\t');
                dos.writeFloat(prices[i]);
                dos.write('\t');
                dos.writeInt(nums[i]);
                dos.write('\t');
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 读取 order.txt的内容， 报错， EOFException
     */
    public static void demo2() {
        DataInputStream dis = null;
        File f = new File("/home/hcy/temp/order.txt");

        try {
            dis = new DataInputStream(new FileInputStream(f));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String name = null;
        float price = 0.0f;
        int num = 0;
        char[] temp = null;
        char c = 0;
        int len = 0;

        try {
            while (true) {
                temp = new char[200];
                len = 0;

                while ((c=dis.readChar()) != '\t') {
                    temp[len] = c;
                    len ++;
                }
                name = new String(temp, 0, len);
                price = dis.readFloat();
                dis.readChar();
                num = dis.readInt();
                dis.readChar();
                System.out.printf("名称: %s; 价格: %5.2f;数量: %d\n", name, price, num);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
