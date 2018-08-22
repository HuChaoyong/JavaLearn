package Chapter9;

/**
 * 线程的操作方法中, 有 stop 但是,不推荐使用,
 * 那么, 该如何停止一个线程呢 ?
 *  使用标志位
 */

class Thread8 implements Runnable {
    // 定义标志位
    private boolean flag = true;

    public void run() {
        int i = 0;
        while (this.flag) {
            while (true) {
                System.out.println(Thread.currentThread().getName() + "运行, i = " +  (i ++) );
            }
        }
    }

    public void stop() {
        // 修改标志位
        this.flag = false;
    }
}

public class ThreadStop {
    public static void main(String[] args) {
        Thread8 m8 = new Thread8();
        Thread my = new Thread();
        my.start();
        my.stop();
    }
}
