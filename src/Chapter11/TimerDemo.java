package Chapter11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *   Timer 和 TimerTask 类， 定时器
 */

class MyTask extends TimerTask {

    @Override
    public void run() {
        SimpleDateFormat sdf = null;
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:ss:SSS");
        System.out.println("当前系统时间为： " + sdf.format(new Date()));
    }
}

public class TimerDemo {
    public static void main(String[] args) {
        Timer t = new Timer();
        MyTask myTask = new MyTask();
        t.schedule(myTask, 1000, 2000);
    }
}
