package Chapter11;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则的使用
 *
 * 1. 判断是不是数字组成
 * 需要用到 Pattern类和Macher类
 *
 */

public class RegExpDemo {
    public static void main(String[] args) {
        String str = "564531531";
        // 字符转数组
//        char[] c = str.toCharArray();

        // java里面的转义要写成两个  \\， 比如 \d => \\d
        if (Pattern.compile("\\d+").matcher(str).matches()) {
            System.out.println("是由数字组成的");
        } else {
            System.out.println("不是由数字组成的");
        }
        // 替换
        String s = Pattern.compile(".+").matcher(str).replaceAll("23333");
        System.out.println("s =" + s);

        // 验证日期格式

        String date1 = "1973-05-21";
        String pat = "\\d{4}-\\d{2}-\\d{2}";
        Pattern p = Pattern.compile(pat);
        Matcher m = p.matcher(date1);
        if (m.matches()) {
            System.out.println("日期合法");
        } else {
            System.out.println("日期无效");
        }

        // 字符串的拆分

        String str2 = "A1B22C333D4444E55555F";
        String pat2 = "\\d+";
        Pattern p2 = Pattern.compile(pat2);
        String[] s2 =  p2.split(str2);
        System.out.println("分割后：" + Arrays.toString(s2));

    }
}
