package Chapter9;

class MyThread extends Thread {
    private String name;
    private int ticket = 5;
    public MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0 ; i < 100; i++) {
            if (ticket > 0) {
                System.out.println("卖票: ticket = " + ticket --);
            }
        }
    }
}

class MyThread2 implements Runnable {
    private int ticket = 5;
    public void run() {
        for (int i = 0; i < 100l; i++) {
            if (ticket > 0) {
                System.out.println("卖票: ticket = " + ticket --);
                System.out.println(Thread.currentThread().getName() + "运行, i = " + i);
            }
        }
    }
}

public class ThreadClass {
    public static void main(String[] args) {
        System.out.println("==========================  使用继承 Thread  ===========================");
        MyThread t1 = new MyThread("线程A");
        MyThread t2 = new MyThread("线程B");

//        t1.start();
//        t2.start();

        /** 单独运行上方 或者 下方的部分 **/

        System.out.println("==========================  使用 Runnable 实现接口  ===========================");
        MyThread2 mt2 = new MyThread2();
        new Thread(mt2, "名称1").start();
        new Thread(mt2).start();
        new Thread(mt2, "名称3").start();
        System.out.println("=====================================================");
        System.out.println("当前线程: " + Thread.currentThread().getName());
    }
}
