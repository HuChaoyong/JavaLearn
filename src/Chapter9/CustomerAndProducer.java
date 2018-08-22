package Chapter9;

/**
 * 生产者和消费者模式, 生产者生产产品, 消费者取走产品
 */

// 定义信息

class Info {
    private String name = "李兴华";
    private String content = "Java讲师";
    private boolean flag = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public synchronized void set(String name, String content) {
        if (!flag) {
            try {
                // 等待 消费者取走
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setName(name);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setContent(content);
        flag = false;
        // 唤醒等待线程
        super.notify();
    }

    public synchronized void get() {
        if (flag) {
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getName() + " ===> " + this.getContent());
        flag = true;
        super.notify();
    }

}

// 定义生产者

class Producer implements Runnable {
    private Info info = null;
    public Producer(Info info) {
        this.info = info;
    }
    public void run() {
        boolean flag = false;
        for (int i = 0; i < 50; i ++) {
            if (flag) {
                this.info.set("李兴华", "Java讲师");
                flag = false;
            } else {
                this.info.set("mldn", "www.mldnjava.cns");
                flag = true;
            }
        }
    }
}

// 定义消费者

class Consumer implements Runnable {
    private Info info = null;
    public Consumer(Info info) {
        this.info = info;
    }
    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 取出信息
            this.info.get();
        }
    }
}

public class CustomerAndProducer {
    public static void main(String[] args) {
        Info i = new Info();
        Producer pro = new Producer(i);
        Consumer con = new Consumer(i);
        new Thread(pro).start();
        new Thread(con).start();
    }
}
