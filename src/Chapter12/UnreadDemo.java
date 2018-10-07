package Chapter12;


import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;

/**
 * read的回退操作，即把读到到数据放回缓冲区
 *  读取到 . 后回退
 */

public class UnreadDemo {
    public static void main(String[] args) {
        demo1();
    }

    public static void demo1() {
        String str = "www.csdn.com";
        PushbackInputStream push = null;
        ByteArrayInputStream bai = null;

        bai = new ByteArrayInputStream(str.getBytes()); // 实例化内存输入流
        push = new PushbackInputStream(bai); // 实例回退流对象

        System.out.println("读取之后的数据为: ");

        int temp = 0;
        try {
            while ((temp = push.read()) != -1) {
                if (temp == '.') {
                    push.unread(temp);
                    temp = push.read();
                    System.out.println("（退回 " + (char)temp + "） ");
                } else {
                    System.out.println((char)temp);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
