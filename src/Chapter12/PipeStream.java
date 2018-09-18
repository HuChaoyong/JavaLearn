package Chapter12;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * 管道流： 可以进行两个线程间通信
 *  使用如下方法连接
 *   public void connect(PipedInputStream snk) throws IOException
 */

class Send implements Runnable {
    private PipedOutputStream pos = null;

    public Send() {
        this.pos = new PipedOutputStream();
    }

    public void run() {
        String str = "Hello world!";
        try {
            // 输出信息
            this.pos.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            this.pos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 通过线程类得到输出流
    public PipedOutputStream getPos() {
        return pos;
    }
}

class Receive implements Runnable {
    private PipedInputStream pis = null;

    public Receive() {
        this.pis = new PipedInputStream();
    }

    public void run() {
        byte[] b = new byte[1024];
        int len = 0;
        try {
            len = this.pis.read(b);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            this.pis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("接收的内容为: " + new String(b, 0, len));
    }

    public PipedInputStream getPis() {
        return pis;
    }
}

public class PipeStream {
    public static void main(String[] args) {
        Send s = new Send();
        Receive r = new Receive();

        try {
            // 连接管道
            s.getPos().connect(r.getPis());
        } catch (IOException e) {
            e.printStackTrace();
        }
        new Thread(s).start();
        new Thread(r).start();
    }
}
