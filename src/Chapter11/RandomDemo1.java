package Chapter11;

// 随机数产生类 Random

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            // 生成不大于 100 的随机数
            System.out.print(r.nextInt(100) + "\t");
        }
    }
}
