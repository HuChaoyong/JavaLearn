package Chapter11;

import java.util.Arrays;

/**
 *  String中对正则的支持， 相当方便啊！
 */

public class RegExpDemo2 {
    public static void main(String[] args) {
        String str1 = "A1B22C333D4444E55555F";
        String str2 = "1972-02-11";
        String str3 = "A1B22C333D4444E55555F";

        System.out.println("字符串替换操作： " + str1.replaceAll("\\d+", "_"));
        System.out.println("字符串替换验证： " + str2.matches("\\d{4}-\\d{2}-\\d{2}"));
        System.out.println("字符串拆分：" + Arrays.toString(str3.split("\\d+")));
    }
}
