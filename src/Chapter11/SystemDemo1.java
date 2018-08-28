package Chapter11;

public class SystemDemo1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int sum  = 0;

        for (int i = 0; i < 3000000; i++) {
            sum += i;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("计算所花费的时间: " + (endTime - startTime) + "毫秒");
    }
}
