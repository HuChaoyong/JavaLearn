package Chapter9;

import static java.lang.System.out;

class MyThread5 implements Runnable {
    public void run() {
        out.println("1. 进入main方法");

        try {
            Thread.sleep(4000);
            out.println("2. 休眠开始");
        } catch (Exception e) {
            out.println("3. 休眠被终止");
            e.printStackTrace();
            return;
        } finally {
            out.println("玩蛇");
        }
        out.println("4. run方法正常结束");
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);
        System.out.println(Thread.MAX_PRIORITY);
        MyThread5 m5 = new MyThread5();
        Thread t = new Thread(m5);
        t.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        t.interrupt();
    }
}
