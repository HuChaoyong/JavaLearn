package Chapter9;

import static java.lang.System.out;

class MyThread6 implements Runnable {
    public void run() {

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
            out.println(Thread.currentThread().getName() +  "运行, i =" + i);
        }
    }
}

public class ThreadDemo3 {
    public static void main(String[] args) {
        Thread m5 = new Thread(new MyThread6(), "线程A");
        Thread m6 = new Thread(new MyThread6(), "线程B");
        Thread m7 = new Thread(new MyThread6(), "线程C");

        m5.setPriority(Thread.MIN_PRIORITY);
        m6.setPriority(Thread.MAX_PRIORITY);
        m7.setPriority(Thread.NORM_PRIORITY);

        m5.start();
        m6.start();
        m7.start();
    }
}
