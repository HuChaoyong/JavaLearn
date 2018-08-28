package Chapter11;

// 简单日期转换,比如 20180828 10:11:23 转换成 2018年8月28日 10时11分23秒

import java.text.*;
import java.util.*;

public class DateDemo4 {
    public static void main(String[] args) {
        //定义日期的字符串
        String strDate = "2018-08-28 10:11:30.231";

        String pat1 = "yyyy-MM-dd HH:mm:ss.SSS";
        String pat2 = "yyyy年MM月dd日 HH时mm分ss秒 SSS毫秒";

        // 实例化模板对象
        SimpleDateFormat sdf1 = new SimpleDateFormat(pat1);
        SimpleDateFormat sdf2 = new SimpleDateFormat(pat2);

        Date d = null;
        try {
            // 将给定字符串中的日期提取出来
            d = sdf1.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // 将日期变成新的格式
        System.out.println(sdf2.format(d));
    }
}
