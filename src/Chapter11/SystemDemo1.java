package Chapter11;

public class SystemDemo1 {
    public static void main(String[] args) {
        demo2();
    }

    public static void demo1() {
        long startTime = System.currentTimeMillis();
        int sum  = 0;

        for (int i = 0; i < 3000000; i++) {
            sum += i;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("计算所花费的时间: " + (endTime - startTime) + "毫秒");
    }

    /**
     * 获取JVM的默认编码
     */
    public static void demo2() {
        System.out.println("系统默认编码： " + System.getProperty("file.encoding"));
    }
}
