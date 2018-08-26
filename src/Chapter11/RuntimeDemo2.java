package Chapter11;

public class RuntimeDemo2 {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();

        // 差点找不到命令行启动的软件 = =..尴尬
        String[] shell = {"/usr/bin/teamviewer"};

        Process pro = null;

        try {
            pro = run.exec(shell);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 打开4秒后关闭
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        pro.destroy();
    }
}
