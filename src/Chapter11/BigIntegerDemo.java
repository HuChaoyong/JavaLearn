package Chapter11;

// 大的整型数字， 超过了 long的就可以用 BigInteger来操作

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("123456789");
        BigInteger bi2 = new BigInteger("987654321");

        System.out.println("加法操作: " + bi1.add(bi2));
        System.out.println("减法操作: " + bi1.subtract(bi2));
        System.out.println("乘法操作: " + bi1.multiply(bi2));
        System.out.println("除法操作: " + bi1.divide(bi2));
        System.out.println("最大数: " + bi1.max(bi2));
        System.out.println("最小数: " + bi1.min(bi2));
        BigInteger[] res = bi2.divideAndRemainder(bi1);
        System.out.println("商是:" + res[0] + ", 余数是:" + res[1]);
    }
}
