package Chapter11;

// NumberFormat 类, 数字样式

import java.text.NumberFormat;

public class NumberFormatDemo {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();

        System.out.println("格式化之后的数字: " + nf.format(1000000));
        System.out.println("格式化之后的数字: " + nf.format(1000.221));
    }
}
