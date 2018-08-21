package Chapter9;

import static java.lang.System.out;

/**
 * 设计一个线程操作类,
 * 可以产生三个线程对象,
 * 并分别设置3个线程的休眠时间
 * 比如: 3秒, 6秒, 8秒
 */

class MyThread7 extends Thread {
    private int time;
    public MyThread7(String name, int time) {
        super(name);
        this.time = time;
    }
    public void run() {

            try {
                Thread.sleep(this.time);
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
            out.println(Thread.currentThread().getName() +  "线程, 休眠了" + this.time / 1000 + "秒" );
    }
}

class MyThread8 implements Runnable {
    private int time;
    private String name;
    public MyThread8(String name, int time) {
        this.name = name;
        this.time = time;
    }
    public void run() {

        try {
            Thread.sleep(this.time);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        out.println(Thread.currentThread().getName() +  "线程, 休眠了" + this.time / 1000 + "秒" );
    }

    public void start() {
        Thread t1 = new Thread(this, this.name);
        t1.start();
    }
}


public class ThreadDemo4 {
    public static void main(String[] args) {
        MyThread7 mt1 = new MyThread7("线程1", 3000);
        MyThread7 mt2 = new MyThread7("线程2", 6000);
        MyThread7 mt3 = new MyThread7("线程3", 8000);
//        mt1.start();
//        mt2.start();
//        mt3.start();

        MyThread8 m1 = new MyThread8("线程A", 3000);
        MyThread8 m2 = new MyThread8("线程B", 6000);
        MyThread8 m3 = new MyThread8("线程C", 9000);

        m1.start();
        m2.start();
        m3.start();
    }
}
