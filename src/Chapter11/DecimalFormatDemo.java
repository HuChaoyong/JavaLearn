package Chapter11;

// DecimalFormat 类 和 SimpleDateFormat 类似,可以指定模板

import java.text.DecimalFormat;

class FormatDemo {
    public void format1(String pattern, double value) {
        DecimalFormat df = new DecimalFormat(pattern);

        String str = df.format(value);

        System.out.println("使用" + pattern + "格式化数字" + value + ": " + str);
    }
}

public class DecimalFormatDemo {
    public static void main(String[] args) {
        FormatDemo demo = new FormatDemo();

        demo.format1("###,###.###", 111222.34567);
        demo.format1("000,000.000", 11222.34567);
        demo.format1("###,###.###￥", 111222.34567);
        demo.format1("000,000.000￥", 111222.34567);
        demo.format1("##.###%", 0.345678);
        demo.format1("00.###%", 0.345678);
        demo.format1("###.###\u2030", 0.345678);
    }
}
