package Chapter11;

// 简单获取日期

import java.text.*;
import java.util.*;

class DateTime {
    // 生命日期对象
    private SimpleDateFormat sdf = null;
    //得到完整日期格式
    public String getDate() {
        this.sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        return this.sdf.format(new Date());
    }

    public String getDateComplement() {
        this.sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒SSS毫秒");
        return this.sdf.format(new Date());
    }

    // 获得时间戳
    public String getTImeStamp() {
        this.sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        return this.sdf.format(new Date());
    }
}

public class DateDemo5 {
    public static void main(String[] args) {
        // 实例化DateTime 对象
        DateTime dt = new DateTime();

        System.out.println("系统日期: " + dt.getDate());

        System.out.println("中文系统: " + dt.getDateComplement());

        System.out.println("时间戳: " + dt.getTImeStamp());
    }
}
