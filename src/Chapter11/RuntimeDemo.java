package Chapter11;

public class RuntimeDemo {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();

        System.out.println("JVM 最大内存量: " + run.maxMemory());
        System.out.println("JVM 空闲最大内存: " + run.maxMemory());

        String str = "Hello " + " World" + " !!!";
        for (int x = 0; x < 1000; x++) {
            str += x;
        }

        System.out.println("JVM 操作后最大内存量: " + run.maxMemory());
        System.out.println("JVM 操作后最大内存量: " + run.maxMemory());
    }
}
